package in.Namitha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Namitha.entity.Employee;
import in.Namitha.repo.EmpRepo;
@Service
public class EmpService {
	@Autowired
	private EmpRepo repo;
	
	public void callCustomQuery() {
		List<Object[]> emps = repo.getEnameEsalary();
		//emps.forEach(e->System.out.println(e.getEname()+" "+e.getEsalary()));
		for(Object[] e:emps) {
			System.out.println(e[0]+" "+e[1]);
		}
	}

}
