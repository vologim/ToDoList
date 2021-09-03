
package com.golovackii.misha.service;

import com.golovackii.misha.entity.Deal;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.golovackii.misha.dao.CaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseServiceImpl implements CaseService{

    @Autowired
    private CaseDAO caseDAO;
    
    @Override
    @Transactional
    public List<Deal> getAllList() {
        return caseDAO.getAllList();
    }
    
}