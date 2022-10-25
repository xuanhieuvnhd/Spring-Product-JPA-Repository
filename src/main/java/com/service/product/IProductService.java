package com.service.product;

import com.model.Product;
import com.service.IGeneralService;

import java.util.List;

public interface IProductService extends IGeneralService<Product> {
    List<Product> findByNameContaining(String name);
}
