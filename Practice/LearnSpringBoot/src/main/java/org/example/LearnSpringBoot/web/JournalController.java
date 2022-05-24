package org.example.LearnSpringBoot.web;

import org.example.LearnSpringBoot.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JournalController {

    @Autowired
    JournalRepository repository;

    /*this method will return all entries from database*/
    @RequestMapping
    public String index(Model model) {
        model.addAttribute("journal", repository.findAll());
        return "index";
    }
}
