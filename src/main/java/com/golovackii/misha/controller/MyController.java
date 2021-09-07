
package com.golovackii.misha.controller;

import com.golovackii.misha.entity.Deal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.golovackii.misha.service.CaseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
    
    @Autowired
    private CaseService caseService;
    
    @RequestMapping("/")
    public String showAllCases(Model model){
        
        List<Deal> deals = caseService.getAllList();
        model.addAttribute("dealList", deals);
        
        return "show-to-do-list";
    }
    
    @RequestMapping("/addNewCase")
    public String addNewCase(Model model){
        
        Deal deal = new Deal();
        
        model.addAttribute("newCase", deal);
        
        return "add-new-case";
    }
    
    @RequestMapping("/saveCase")
    public String saveCase(@ModelAttribute("newCase") Deal deal){
        
        caseService.save(deal);
        
        return "redirect:/";
    }
    
    @RequestMapping("/deleteCase")
    public String deleteCase(@RequestParam("caseId") int id){
        
        caseService.delete(id);
        
        return "redirect:/";
    }
    
}
