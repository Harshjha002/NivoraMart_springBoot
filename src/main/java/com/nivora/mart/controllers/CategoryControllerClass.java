package com.nivora.mart.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryControllerClass {

    @GetMapping()
    public  String getCategory(){
        return "Electronics";
    }

    @PostMapping()
    public  String setCategory(){
        return "post Electronics";
    }

    @GetMapping("/count")
    public  int getCategoryCount(){
        return 5;
    }

    @DeleteMapping()
    public  String deleteCategory(){
        return "Category Deleted";
    }
}
