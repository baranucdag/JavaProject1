package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abtracts.ProductDao;
import nLayeredDemo.entites.concrete.Product;

public class AbcProducDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("product added with Abc system:  " + product.getName());
	}

	@Override
	public void uptade(Product product) {
	}

	@Override
	public void delete(Product product) {
	}

	@Override
	public Product get(int id) {
		return null;
	}

	@Override
	public List<Product> getAll() {
		return null;
	}

}
