package in.Namitha.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.Namitha.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee,Integer> {
	
	@Query(value="Select ename, esalary from Employee ")
	public List<Object[]> getEnameEsalary();
	

}
