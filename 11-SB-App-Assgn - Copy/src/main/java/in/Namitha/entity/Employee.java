package in.Namitha.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private Integer eid;
	private String ename;
	private Double esalary;
	
	
	public Integer getId() {
		return eid;
	}
	public void setId(Integer id) {
		this.eid = id;
	}
	public String getName() {
		return ename;
	}
	public void setName(String name) {
		this.ename = name;
	}
	public Double getDepartment() {
		return esalary;
	}
	public void setDepartment(Double salary) {
		this.esalary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + eid + ", name=" + ename + ", esalary=" + esalary + "]";
	}
	
	

}
