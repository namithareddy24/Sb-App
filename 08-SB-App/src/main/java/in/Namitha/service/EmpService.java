package in.Namitha.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.Namitha.entity.Employee;
import in.Namitha.repo.EmpRepo;

@Service
public class EmpService {
	private EmpRepo empRepo;
	
	public EmpService(EmpRepo repo) {
		this.empRepo=repo;
	}
	
	public void getAllEmps() {
		List<Employee> emps = empRepo.findAll();
		emps.forEach(System.out::println);
	}
	public void getAllEmpsFilter() {
		
		Employee entity=new Employee();
		
		entity.setEname("Rama");
		Example<Employee> example = Example.of(entity);
		
		List<Employee> emps = empRepo.findAll(example);
		emps.forEach(System.out::println);
	}
	
	public void getAllEmpsPagination() {
		
		int pageSize=3;
		int pageNumber=0;
		PageRequest request = PageRequest.of(pageNumber, pageSize);
		
		Page<Employee> emps = empRepo.findAll(request);
		emps.forEach(System.out::println);
	}
	
	
	public void getAllSortEmps() {
		Sort sort = Sort.by("ename","esalary").ascending();
		List<Employee> emps = empRepo.findAll(sort);
		emps.forEach(e->System.out.println(e));
	}

}
