
package com.golovackii.misha.dao;

import com.golovackii.misha.entity.Deal;
import java.util.List;

public interface CaseDAO {
    List<Deal> getAllList();

    void save(Deal deal);
    
    
}
