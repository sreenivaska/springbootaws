package com.sreeni.ws.aws.services;

import com.sreeni.ws.aws.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService
{
    public static ArrayList<Product> products = new ArrayList<Product>();

    static {
        products.add(new Product(100, "Mobile", "CLK98123", 9000.00, 6));
        products.add(new Product(101, "Smart TV", "LGST09167", 60000.00, 3));
        products.add(new Product(102, "Washing Machine", "38753BK9", 9000.00, 7));
        products.add(new Product(103, "Laptop", "LHP29OCP", 24000.00, 1));
        products.add(new Product(104, "Air Conditioner", "ACLG66721", 30000.00, 5));
        products.add(new Product(105, "Refrigerator ", "12WP9087", 10000.00, 4));
    }
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id){

        return products.stream().filter(product -> product.getId() == id).findFirst().get();
    }
}
