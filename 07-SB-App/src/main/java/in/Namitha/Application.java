package in.Namitha;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Namitha.service.EmpService;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
				ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		EmpService empService = context.getBean(EmpService.class);
//		 empService.saveEmployee();
//		 empService.saveEmps();
//		empService.getEmp(201);
//		empService.getEmps(Arrays.asList(101,102,103));
//		empService.getEmps();
//		empService.callFindByMethods();
		empService.callCustomQueries();
		
 	}

}