package com.example.bestwallpapers;

public class CategoryRVModal {
    private  String category;
    private  String CategoryIVUrl;

    public CategoryRVModal(String category, String categoryIVUrl) {
        this.category = category;
        this.CategoryIVUrl = categoryIVUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryIVUrl() {
        return CategoryIVUrl;
    }

    public void setCategoryIVUrl(String categoryIVUrl) {
        this.CategoryIVUrl = categoryIVUrl;
    }
}
