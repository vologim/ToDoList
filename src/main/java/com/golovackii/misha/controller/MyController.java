
package com.golovackii.misha.controller;

import com.golovackii.misha.entity.Deal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.golovackii.misha.service.CaseService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    
    @Autowired
    private CaseService caseService;
    
    @RequestMapping("/")
    public String showAllLost(Model model){
        
        List<Deal> deals = caseService.getAllList();
        model.addAttribute("dealList", deals);
        
        return "show-to-do-list";
    }
    
}
