package in.Namitha.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private Integer eid; 
	private String ename; 
	private Double esalary; 
	
	
	public Employee() {
		
	}

	public Employee(Integer Eid, String Ename, Double Esalary) {
		this.eid = Eid;
		this.ename = Ename;
		this.esalary  = Esalary;
	}

	public Integer getEid() {
		return eid;
	}

	
	public void setEid(Integer Eid) {
		this.eid = Eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String Ename) {
		this.ename = Ename;
	}

	public Double getEsalary() {
		return esalary;
	}

	public void setEsalary(Double Esalary) {
		this.esalary = Esalary;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + eid + ", Ename=" + ename + ", Esalary=" + esalary + "]";
	}

}