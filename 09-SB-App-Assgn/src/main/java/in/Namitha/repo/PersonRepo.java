package in.Namitha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Namitha.entity.Person;

public interface PersonRepo extends JpaRepository<Person,Integer> {

}
