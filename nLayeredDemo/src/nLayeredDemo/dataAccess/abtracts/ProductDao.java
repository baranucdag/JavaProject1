package nLayeredDemo.dataAccess.abtracts;

import java.util.List;

import nLayeredDemo.entites.concrete.Product;

public interface ProductDao {
	void add(Product product);
	void uptade(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> getAll();
	

}
