package in.Namitha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Namitha.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpService service = context.getBean(EmpService.class);
//		service.getAllEmps();
//		service.getAllSortEmps();
//		service.getAllEmpsPagination();
		service.getAllEmpsFilter();
		
	}
	

}
