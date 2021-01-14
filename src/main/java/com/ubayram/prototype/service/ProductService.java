package com.ubayram.prototype.service;

import com.ubayram.prototype.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: ubayram
 * Date: 14.01.2021
 * Time: 12:52
 */
@Service
public class ProductService {

    private final ProductDao productDao;

    @Autowired
    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public ProductDao getProductDao() {
        return productDao;
    }
}
