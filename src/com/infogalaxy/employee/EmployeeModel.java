package com.infogalaxy.employee;

public class EmployeeModel {
		private int eid;
		private String ename;
		private String mobno;
		private double salary;
		
		public void setEid(int eid)
		{
			this.eid = eid;
		}
		public void setEname(String ename) {
			this.ename = ename ;
		}
		public void setMobileNo(String mobno) {
			this.mobno = mobno ;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public int getEid() {
			return this.eid;
		}
		public String getEname() {
			return this.ename;
		}
		public String getMobileNo() {
			return this.mobno;
		}
		public double getSalary() {
			return this.salary;
		}

	}


