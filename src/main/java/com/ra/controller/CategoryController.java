package com.ra.controller;

import com.ra.model.entity.Category;
import com.ra.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id,Model model){
        Category category = categoryService.findById(id);
        model.addAttribute("category",category);
        return "edit-category";
    }
    @PostMapping("/edit/{id}")
    public String update(@ModelAttribute("category") Category category,@PathVariable Long id){
        category.setCategoryId(id);
        categoryService.saveOrUpdate(category);
        return "redirect:/category";
    }
}
