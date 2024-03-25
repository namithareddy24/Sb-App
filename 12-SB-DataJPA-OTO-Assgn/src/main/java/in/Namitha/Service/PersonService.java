package in.Namitha.Service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Namitha.entity.Passport;
import in.Namitha.entity.Person;
import in.Namitha.repo.PassportRepo;
import in.Namitha.repo.PersonRepo;

@Service
public class PersonService {
	@Autowired
	private PersonRepo person;
	@Autowired
	private PassportRepo passport;
	
	public void getPassport() {
		passport.findById(1);
	}
	
	public void getPerson() {
		person.findById(1);
	}
	 
	public void savePerson() {
		Person p = new Person();
		p.setName("Namitha");
		p.setGender("Female");
		
		Passport pp = new Passport();
		pp.setPassportNum("JE235145W8");
		pp.setIssuedDate(LocalDate.now());
		pp.setExpDate(LocalDate.now().plusYears(10));
		
		
		p.setPassport(pp);
		
		pp.setPerson(p);
		
		person.save(p);
		
		System.out.println("Record Saved...");
	}

}
