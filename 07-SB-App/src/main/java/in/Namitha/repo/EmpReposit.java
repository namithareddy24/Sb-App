package in.Namitha.repo;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.Namitha.entity.Employee;

public interface EmpReposit extends CrudRepository<Employee, Integer> {
	
	
	@Query("from Employee")
	public List<Employee> getAllEmpsHQL();
	
	@Query("from Employee where eid=:id")
	public List<Employee> getEmpById(Integer id);
	
	@Query(value="select * from employee", nativeQuery=true)
	public List<Employee> getAllEmpsSQL();
	
	@Query(value="")
	
	public List<Employee> findByEname(String ename);
	
	public List<Employee> findByEsalary(Double Esalary);
	
	public List<Employee> findByEsalaryGreaterThanEqual(Double Esalary);
}