package in.Namitha.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Namitha.Repo.EmployeeRepo;
import in.Namitha.entity.Employee;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;
	
	@Transactional
	public void getEmployee() {
		Integer empid=101;
		List<Employee> emps = repo.Employee(empid);
		emps.forEach(System.out::println);
		
	}

}
