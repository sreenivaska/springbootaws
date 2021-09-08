package com.sreeni.ws.aws.services;
import com.sreeni.ws.aws.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(int id);
}
