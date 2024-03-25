package in.Namitha.service;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Namitha.entity.Role;
import in.Namitha.entity.User;
import in.Namitha.repo.RoleRepo;
import in.Namitha.repo.UserRepo;

@Service
public class UserRoleService {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private RoleRepo roleRepo;
	
	public void saveUserWithRoles() {
		Role r1=new Role();
		r1.setRoleName("Manager");
		
		Role r2=new Role();
		r2.setRoleName("Admin");
		
		User user=new User();
		user.setUsername("Namitha");
		user.setGender("Female");
		user.setUserDob(LocalDate.now().minusYears(20));
		
		user.setRoles(Arrays.asList(r1,r2));
		
		userRepo.save(user);
	}

}
