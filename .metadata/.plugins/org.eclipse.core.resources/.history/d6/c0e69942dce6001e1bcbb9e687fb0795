package in.Namitha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Namitha.bindings.Product;
import in.Namitha.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepo productRepo;
	@Override
	public boolean saveProduct(Product p) {
			Product saveProduct = productRepo.save(p);		
			return saveProduct.getPid()!=null;
		}
	

	@Override
	public List<Product> getAllProducts() {
		
		return productRepo.findAll();
	}


	@Override
	public void deleteProduct(Integer id) {
		productRepo.deleteById(id);
		
		
	}


	@Override
	public Product getProductById(Integer id) {
		Optional<Product> p = productRepo.findById(id);
		Product product=null;
		if(p.isPresent()) {
			product=p.get();
		}else {
			throw new RuntimeException("Product not found for id ::"+id);
		}
		return product;
	}


	
}
