package com.bill.springbootmall.service;

import com.bill.springbootmall.dto.ProductQueryParams;
import com.bill.springbootmall.dto.ProductRrquest;
import com.bill.springbootmall.model.Product;
import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer prroductId);
    Integer createProduct(ProductRrquest productRrquest);
    void updateProduct(Integer productId, ProductRrquest productRrquest);
    void deleteProductById(Integer productId);

}
