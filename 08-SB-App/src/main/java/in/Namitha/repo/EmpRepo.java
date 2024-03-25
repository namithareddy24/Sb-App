package in.Namitha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Namitha.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee,Integer>{

}
