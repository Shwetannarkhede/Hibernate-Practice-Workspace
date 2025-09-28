package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int empid;
    private String empname;
    private int salary;
    @Column(unique = true)
    private String email;
    private String address;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public Employee(int empid, String empname, int salary, String email, String address) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.email = email;
		this.address = address;
	}
	
	
	public Employee() {
		
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", email=" + email
				+ ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
