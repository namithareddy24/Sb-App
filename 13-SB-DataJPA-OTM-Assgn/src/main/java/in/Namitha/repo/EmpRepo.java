package in.Namitha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Namitha.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
