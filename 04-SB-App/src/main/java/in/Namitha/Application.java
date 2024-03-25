package in.Namitha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Namitha.Service.StudentService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		StudentDao studentDao = context.getBean(StudentDao.class);
//		String name = studentDao.findName(100);
//		System.out.println(name);
		StudentService service=context.getBean(StudentService.class);
		service.getName(100);
		service.getName(12);
	}
	

}
