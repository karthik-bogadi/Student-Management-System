package com.micro.www.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {


	    @Id
	    private int rollNo;

	    private String name;

	    private String branch;

	    // Getters and Setters

	    public int getRollNo() {
	        return rollNo;
	    }

	    public void setRollNo(int rollNo) {
	        this.rollNo = rollNo;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getBranch() {
	        return branch;
	    }

	    public void setBranch(String branch) {
	        this.branch = branch;
	    }
}
