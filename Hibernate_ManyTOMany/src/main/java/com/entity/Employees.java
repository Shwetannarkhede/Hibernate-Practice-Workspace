package com.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Employees {
	@Id
	private int empid;
    private String empname;
    private int salary;
    private String email;
    private String address;
    
    @JoinTable(
            name = "employee_department",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "department_id")
        )
    
	@ManyToMany
	List<Departments> dept;
  //Departments dept;

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

	public List<Departments> getDept() {
		return dept;
	}

	public void setDept(List<Departments> dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employees [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", email=" + email
				+ ", address=" + address + ", dept=" + dept + "]";
	}

	public Employees(int empid, String empname, int salary, String email, String address, List<Departments> dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.email = email;
		this.address = address;
		this.dept = dept;
	}

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
