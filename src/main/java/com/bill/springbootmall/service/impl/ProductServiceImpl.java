package com.bill.springbootmall.service.impl;

import com.bill.springbootmall.dao.ProductDao;
import com.bill.springbootmall.dto.ProductRrquest;
import com.bill.springbootmall.model.Product;
import com.bill.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer prroductId) {
        return productDao.getProductById(prroductId);
    }

    @Override
    public Integer createProduct(ProductRrquest productRrquest) {
        return productDao.createProduct(productRrquest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRrquest productRrquest) {
        productDao.updateProduct(productId, productRrquest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}
