package in.Namitha.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import in.Namitha.entity.Person;
import in.Namitha.repo.PersonRepo;

@Service
public class PersonService {
	private PersonRepo personRepo;

	public PersonService(PersonRepo personRepo) {
		this.personRepo = personRepo;
	}
	
	public void savePerson() {
		LocalDate dob = LocalDate.of(2002, 7, 9);
		 Person p = new Person();
		 p.setPerson_Id( 102);
		 p.setPerson_name("adi");
		 p.setPerson_gender("Female");
		 p.setPerson_Dob(dob);
		 byte[] img="E:\\namitha.jpg".getBytes();
		 p.setPerson_photo(img);
		 byte[] resume="D:\\My resume\\resume.pdf".getBytes();
		 p.setPerson_Resume(resume);
		 
		 personRepo.save(p);
		 
		 System.out.println("Record saved..");
		 
	}
	
	

}
