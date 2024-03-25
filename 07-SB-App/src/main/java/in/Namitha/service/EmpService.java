package in.Namitha.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.Namitha.entity.Employee;
import in.Namitha.repo.EmpReposit;


@Service
public class EmpService {

	private EmpReposit empReposit;

	public EmpService(EmpReposit empReposit) {
		this.empReposit = empReposit;
	}
	
	public void callCustomQueries() {
//		List<Employee> emps = empReposit.getAllEmpsHQL();
//		emps.forEach(System.out::println);
		
		
//		List<Employee> empById = empReposit.getEmpById(101);
//		System.out.println(empById);
		
		List<Employee> emps = empReposit.getAllEmpsSQL();
		emps.forEach(System.out::println);
	}
	public void callFindByMethods() {
//		List<Employee> emps = empReposit.findByEname("Ashok");
//		List<Employee> emps = empReposit.findByEsalary(50000.3);
		List<Employee> emps = empReposit.findByEsalaryGreaterThanEqual(40000.0);
		emps.forEach(System.out::println);
	}
	
	public void getEmps() {
		Iterable<Employee> emps = empReposit.findAll();	
		emps.forEach(System.out::println);
	}
	
	public void getEmps(List<Integer> Eids) {
		Iterable<Employee> emps = empReposit.findAllById(Eids);
		emps.forEach(e->System.out.println(e));
	}
	
	public void getEmp(Integer Eid) {
		Optional<Employee> findById = empReposit.findById(Eid);
		if(findById.isPresent()) {
			Employee employee = findById.get();	
			System.out.println(employee);
		}else {
			System.out.println("Record not found ");
		}
	}
	public void saveEmps() {
		Employee e1=new Employee(201,"Rama",10000.00);
		Employee e2=new Employee(202,"Sita",10000.00);
		List<Employee> emps = Arrays.asList(e1,e2);
		empReposit.saveAll(emps);
		System.out.println("record saved...");
	}
	
	public void saveEmployee() {
		
		Employee e = new Employee();
		e.setEid(101);
		e.setEname("Namitha");
		e.setEsalary(50000.30);

		empReposit.save(e); 

		System.out.println("Record saved....");

	}

}