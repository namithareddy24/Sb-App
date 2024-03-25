package in.Namitha.entity;

import java.security.Timestamp;
import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	private String pname;
	private Double pprice;
	
	@CreationTimestamp
	@Column(updatable=false)
	private LocalDate orderdate;
	
	@UpdateTimestamp
	@Column(insertable=false)
	private LocalDate deliverdate;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPprice() {
		return pprice;
	}

	public void setPprice(Double pprice) {
		this.pprice = pprice;
	}

	public LocalDate getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}

	public LocalDate getDeliverdate() {
		return deliverdate;
	}

	public void setDeliverdate(LocalDate deliverdate) {
		this.deliverdate = deliverdate;
	}
	
	
}
