package nLayeredDemo.business.concretes;

import java.util.List;
import jLogger.JLoggerManager;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.dataAccess.abtracts.ProductDao;
import nLayeredDemo.entites.concrete.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private JLoggerManager loggerService;
	
	public ProductManager(ProductDao productDao, JLoggerManager loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		if (product.getCategoryId() == 1) {
			System.out.println("you cannot add a product to this category");
			return; 
		}
		this.productDao.add(product);
		this.loggerService.log("Products logged with JLoggerService: "+product.getName());
	}
 
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
