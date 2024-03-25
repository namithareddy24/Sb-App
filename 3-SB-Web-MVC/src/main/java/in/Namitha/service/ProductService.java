package in.Namitha.service;

import java.util.List;


import in.Namitha.bindings.Product;

public interface ProductService {
	
	public boolean saveProduct(Product p);
	
	public List<Product> getAllProducts();
	
	public Product getProductById(Integer id);
	
	public void deleteProduct(Integer id);

}
