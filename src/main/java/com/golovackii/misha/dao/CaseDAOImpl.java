
package com.golovackii.misha.dao;

import com.golovackii.misha.entity.Deal;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CaseDAOImpl implements CaseDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public List<Deal> getAllList() {
        Session session = sessionFactory.getCurrentSession();
        
        List<Deal> deals = session.createQuery("from Deal", Deal.class).getResultList();
        Comparator<Deal> comparator = ((o1, o2) -> 
                    {return Integer.compare(o2.getImportance(), o1.getImportance());});
        Collections.sort(deals, comparator);
        
        return deals;
    }

    @Override
    public void save(Deal deal) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(deal);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Deal> query = session.createQuery("delete from Deal where id =:dealId");
        query.setParameter("dealId", id);
        query.executeUpdate();
    }

    @Override
    public Deal getDeal(int id) {
        Session session = sessionFactory.getCurrentSession();
        Deal deal = session.get(Deal.class, id);
        return deal;
    }
    
}

