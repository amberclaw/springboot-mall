package com.bill.springbootmall.service.impl;

import com.bill.springbootmall.dao.ProductDao;
import com.bill.springbootmall.dto.ProductQueryParams;
import com.bill.springbootmall.dto.ProductRrquest;
import com.bill.springbootmall.model.Product;
import com.bill.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Integer countProduct(ProductQueryParams productQueryParams) {
        return productDao.countProduct(productQueryParams);
    }

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

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
