package com.cts.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bean.Product;
import com.cts.dao.ProductDao;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	//wire dependency
	
	
	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public Product getProductDetails(int product_code) {
		//add your code here
		return productDao.getProductDetails(product_code);
	}
	
	public double calculatePrice(int quantity,double product_price) {
		//add your code here
		return (double)quantity*product_price;
	}
	
	public boolean validateProductCode(int product_code){
		//add your code here
		return (product_code>0 && String.valueOf(product_code).length()==4);
	}
	
	public boolean validateQuantity(int quantity){
		//add your code here
		return quantity>0;
	}
}
