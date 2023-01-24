package com.bill.springbootmall.service;

import com.bill.springbootmall.dto.ProductRrquest;
import com.bill.springbootmall.model.Product;
import java.util.List;

public interface ProductService {

    List<Product> getProducts();
    Product getProductById(Integer prroductId);
    Integer createProduct(ProductRrquest productRrquest);
    void updateProduct(Integer productId, ProductRrquest productRrquest);
    void deleteProductById(Integer productId);

}
