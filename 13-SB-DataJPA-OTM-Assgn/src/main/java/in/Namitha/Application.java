package in.Namitha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Namitha.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		EmpService bean = ctxt.getBean(EmpService.class);
		bean.saveEmp();
//		bean.getEmp();
//		bean.getAddress();
//		bean.deleteEmp();
	}

}
