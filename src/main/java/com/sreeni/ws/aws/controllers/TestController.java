package com.sreeni.ws.aws.controllers;

import com.sreeni.ws.aws.model.Employee;
import com.sreeni.ws.aws.model.Product;
import com.sreeni.ws.aws.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {


	@Autowired
	private IProductService productService;

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public List<Product> getProducts(){

		List<Product> products = productService.findAll();
		return products;
	}

	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	public Product getProducts(@RequestParam(value = "id", required = false, defaultValue = "100") int id){

		Product product = productService.findById(id);
		return product;
	}

}