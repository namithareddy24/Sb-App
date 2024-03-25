package in.Namitha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import in.Namitha.service.EmpService;

@SpringBootApplication
@EntityScan(basePackages="in.Namitha.entity")
@EnableJpaRepositories(basePackages = "in.Namitha.repo") 
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		EmpService service = ctxt.getBean(EmpService.class);
		service.callCustomQuery();
	}

}
