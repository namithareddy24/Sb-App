package in.Namitha.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	private Integer eid; 
	@Column(name="ename")
	private String ename;
	@Column(name="esalary")
	private Double esalary; 
	
	public Employee() {
		
	}
	public Employee(Integer eid, String ename, Double esalary) {
		
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
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
		return "Employee [ename=" + ename + ", esalary=" + esalary + "]";
	}

}


