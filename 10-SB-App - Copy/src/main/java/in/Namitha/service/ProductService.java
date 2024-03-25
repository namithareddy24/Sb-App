package in.Namitha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Namitha.entity.Product;
import in.Namitha.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;
	
	
	public void saveProduct() {
		Product p = new Product();
		p.setPname("Varalakshmi");
		p.setPprice(50000.0);
		repo.save(p);
		
	}
}
