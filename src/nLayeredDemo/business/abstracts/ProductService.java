package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entites.concrete.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
}
