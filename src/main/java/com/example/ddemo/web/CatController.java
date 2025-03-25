package com.example.ddemo.web;

import com.example.ddemo.model.Cat;
import com.example.ddemo.model.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class CatController {

    @Autowired
    private CatRepository catRepository;

    @GetMapping
    public String showCats(Model model) {
        List<Cat> cats = catRepository.findAll();
        model.addAttribute("cats", cats);
        return "index";
    }
}
