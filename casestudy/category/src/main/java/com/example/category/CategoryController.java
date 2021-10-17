package com.example.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorys")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping(value = "/list")
    public List<Category> getAllCoupons(){
        return categoryRepository.findAll();
    }
    @PostMapping(value = "/add")
    public Category addCoupon(@RequestBody Category category){
        return categoryRepository.save(category);
    }
    @DeleteMapping(value = "/delete/{categoryID}")
    public void deleteProduct(@PathVariable String categoryID) {
        System.out.println("Delete method called");
        categoryRepository.deleteById(categoryID);
    }
}
