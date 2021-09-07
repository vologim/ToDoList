
package com.golovackii.misha.service;

import com.golovackii.misha.entity.Deal;
import java.util.List;


public interface CaseService {

    List<Deal> getAllList();

    void save(Deal deal);
    
    void delete(int id);
    
}
