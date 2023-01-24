package com.bill.springbootmall.dao;

import com.bill.springbootmall.dto.ProductRrquest;
import com.bill.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer prroductId);
    Integer createProduct(ProductRrquest productRrquest);

}
