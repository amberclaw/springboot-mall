package com.bill.springbootmall.service;

import com.bill.springbootmall.dto.ProductRrquest;
import com.bill.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer prroductId);
    Integer createProduct(ProductRrquest productRrquest);
}
