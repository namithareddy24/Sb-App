package in.Namitha.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Namitha.entity.Address;
import in.Namitha.entity.Emp;
import in.Namitha.repo.AddressRepo;
import in.Namitha.repo.EmpRepo;

@Service
public class EmpService {
	@Autowired
	private EmpRepo emprepo;
	@Autowired
	private AddressRepo Addrepo;
	
	public void deleteEmp() {
		emprepo.deleteById(1);
	}
	
	public void getAddress() {
		Addrepo.findById(1);
	}
	public void getEmp() {
		Optional<Emp> id = emprepo.findById(1);
		if(id.isPresent()) {
			Emp emp = id.get();
			List<Address> addrList = emp.getAddrList();
			System.out.println(addrList);
		}
	}
	
	public void saveEmp() {
		Emp e = new Emp();
		e.setEname("Ganesh");
		e.setEsal(12300.02);
		
		Emp e1 = new Emp();
		e1.setEname("vinayaka");
		e1.setEsal(12600.02);
		
		
		Address a1 = new Address();
		
		a1.setCity("Kanipakam");
		a1.setState("chittor");
		a1.setCountry("India");
		a1.setType("Present");
		
		Address a2 = new Address();
		
		a2.setCity("Mumbai");
		a2.setState("Maharastra");
		a2.setCountry("India");
		a2.setType("Perment");
		
		
		a2.setEmp(e);
		a1.setEmp(e1);
		
		List<Address> add = Arrays.asList(a1,a2);
		e.setAddrList(add);
		e1.setAddrList(add);
		
		
		List<Emp> emp = Arrays.asList(e,e1);
		emprepo.saveAll(emp);
		
	}

}
