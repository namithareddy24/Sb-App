package in.Namitha.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Person {
	
	@Id
	private Integer person_Id;
	private String person_name;
	private String person_gender;
	private LocalDate person_Dob;
	@Lob
	@Column(length=1000)
	private byte[] person_photo;
	@Lob
	@Column(length=1000)
	private byte[] person_Resume;
	public Integer getPerson_Id() {
		return person_Id;
	}
	public void setPerson_Id(int i) {
		this.person_Id = i;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getPerson_gender() {
		return person_gender;
	}
	public void setPerson_gender(String person_gender) {
		this.person_gender = person_gender;
	}
	public LocalDate getPerson_Dob() {
		return person_Dob;
	}
	public void setPerson_Dob(LocalDate dob) {
		this.person_Dob = dob;
	}
	
	public byte[] getPerson_photo() {
		return person_photo;
	}
	public void setPerson_photo(byte[] person_photo) {
		this.person_photo = person_photo;
	}
	public byte[] getPerson_Resume() {
		return person_Resume;
	}
	public void setPerson_Resume(byte[] person_Resume) {
		this.person_Resume = person_Resume;
	}
	public void setPerson_Id(Integer person_Id) {
		this.person_Id = person_Id;
	}
	@Override
	public String toString() {
		return "Person [person_Id=" + person_Id + ", person_name=" + person_name + ", person_gender=" + person_gender
				+ ", person_Dob=" + person_Dob + ", person_photo=" + person_photo + ", person_Resume=" + person_Resume
				+ "]";
	}
	
	

}
