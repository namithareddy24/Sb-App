package in.Namitha.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Namitha.Dao.StudentDao;

@Service
public class StudentService {
	private StudentDao student;
	
	public StudentService() {
		System.out.println("Student 0-param constructor called..");
	}
	@Autowired
	public StudentService(StudentDao student) {
		System.out.println("Student param constructor called..");
		this.student = student;
	}

	
	public void setStudent(StudentDao student) {
		System.out.println("Student setter method called..");
		this.student = student;
	}

	public void getName(int id) {
		String name = student.findName(id);
		System.out.println(name);
	}
	

}
