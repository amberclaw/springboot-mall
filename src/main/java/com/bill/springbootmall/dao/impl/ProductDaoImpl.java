package com.bill.springbootmall.dao.impl;

import com.bill.springbootmall.dao.ProductDao;
import com.bill.springbootmall.dto.ProductRrquest;
import com.bill.springbootmall.model.Product;
import com.bill.springbootmall.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import javax.swing.plaf.basic.BasicTreeUI;
import java.util.*;



@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Product getProductById(Integer productId) {
        String sql="SELECT product_id, product_name, category, image_url, price, "+
                "stock, description, created_date, last_modified_date "+
                "FROM product WHERE product_id = :productId";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productId", productId);

        List<Product> productList = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());

        if(productList.size() > 0){
            return productList.get(0);
        }else{
            return null;
        }

    }

    @Override
    public Integer createProduct(ProductRrquest productRrquest) {
        String sql = "INSERT INTO product(product_name, category, image_url, price, "+
                "stock, description, created_date, last_modified_date) "+
                "VALUES (:productName, :category, :image_url, :price, :stock, "+
                ":description, :createdDate, :lastModifiedDate)";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productName", productRrquest.getProductName());
        map.put("category", productRrquest.getCategory().toString());
        map.put("image_url", productRrquest.getImageUrl());
        map.put("price", productRrquest.getPrice());
        map.put("stock", productRrquest.getStock());
        map.put("description", productRrquest.getDescriptption());

        Date now = new Date();
        map.put("createdDate", now);
        map.put("lastModifiedDate", now);

        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(map), keyHolder);
        int productId = keyHolder.getKey().intValue();

        return productId;
    }
}
