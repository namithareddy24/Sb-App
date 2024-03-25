package in.Namitha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Namitha.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
