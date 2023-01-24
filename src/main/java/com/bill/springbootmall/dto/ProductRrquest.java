package com.bill.springbootmall.dto;

import com.bill.springbootmall.constant.ProductCategory;

import javax.validation.constraints.NotNull;

public class ProductRrquest {

    @NotNull
    private String  productName;

    @NotNull
    private ProductCategory category;

    @NotNull
    private String  imageUrl;

    @NotNull
    private Integer price;

    @NotNull
    private Integer stock;

    private String  descriptption;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescriptption() {
        return descriptption;
    }

    public void setDescriptption(String descriptption) {
        this.descriptption = descriptption;
    }
}
