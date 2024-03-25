package in.Namitha.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import in.Namitha.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	@Procedure(name="employee")
	List<Employee> Employee(@Param("empid") Integer empid);
	
}
