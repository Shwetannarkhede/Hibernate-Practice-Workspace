package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Departments {
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int dept_ID;
		String dept_Name;

		@ManyToMany(mappedBy = "dept")
		List<Employees> emp;

		public int getDept_ID() {
			return dept_ID;
		}

		public void setDept_ID(int dept_ID) {
			this.dept_ID = dept_ID;
		}

		public String getDept_Name() {
			return dept_Name;
		}

		public void setDept_Name(String dept_Name) {
			this.dept_Name = dept_Name;
		}

		public List<Employees> getEmp() {
			return emp;
		}

		public void setEmp(List<Employees> emp) {
			this.emp = emp;
		}

		public Departments(int dept_ID, String dept_Name, List<Employees> emp) {
			super();
			this.dept_ID = dept_ID;
			this.dept_Name = dept_Name;
			this.emp = emp;
		}

		public Departments() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Departments [dept_ID=" + dept_ID + ", dept_Name=" + dept_Name + ", emp=" + emp + "]";
		}

		
	}


