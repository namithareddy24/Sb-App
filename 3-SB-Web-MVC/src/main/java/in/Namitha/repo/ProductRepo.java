package in.Namitha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Namitha.bindings.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	

}
