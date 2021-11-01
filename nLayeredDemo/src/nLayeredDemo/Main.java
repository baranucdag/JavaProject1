package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.AbcProducDao;
import nLayeredDemo.entites.concrete.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductManager(new AbcProducDao());
		
		Product product1 = new Product(1,1,"armut",12,50);
		productService.add(product1);
		
		
		Product product2 = new Product(2,2,"elma",25,50);
		productService.add(product2);
	}
}