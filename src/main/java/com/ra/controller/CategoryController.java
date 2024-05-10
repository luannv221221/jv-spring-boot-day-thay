package com.ra.controller;

import com.ra.model.entity.Category;
import com.ra.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("")
    public String index(Model model){
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories",categories);
        return "index-category";
    }
    @GetMapping("/add-category")
    public String add(Model model,Category category){
        model.addAttribute("category",category);
        return "add-category";
    }
    @PostMapping("/add-category")
    public String save(@ModelAttribute("category") Category category){
        categoryService.saveOrUpdate(category);
        return "redirect:/category";
    }
}
