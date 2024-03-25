package in.Namitha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Namitha.service.UserRoleService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRoleService service = context.getBean(UserRoleService.class);
		service.saveUserWithRoles();
	}

}
