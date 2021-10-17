package com.example.category;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Categorys")
public class Category {

    private String id;
    private String categoryName;

    public Category(String id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
