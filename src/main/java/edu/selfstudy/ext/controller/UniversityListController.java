package edu.selfstudy.ext.controller;

import edu.selfstudy.ext.domain.University;
import edu.selfstudy.ext.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping(path="/universityList")
public class UniversityListController {
    @Autowired
    private UniversityService universityService;

//  @RequestMapping(method= RequestMethod.GET)
    @GetMapping
    public String findUniversities(Model model){
        List<University> list = universityService.findFullUniversities();
        model.addAttribute("today", LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        model.addAttribute("universities",list);
        return "university";
    }
}
