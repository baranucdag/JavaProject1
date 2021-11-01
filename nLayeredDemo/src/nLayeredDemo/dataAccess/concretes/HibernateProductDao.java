package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abtracts.ProductDao;
import nLayeredDemo.entites.concrete.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("product added with Hibernate:  "+product.getName());
	}

	@Override
	public void uptade(Product product) {
		System.out.println("product uptaded with Hibernate"+product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("product deleted with Hibernate"+product.getName());
		
	}


	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
		
}
