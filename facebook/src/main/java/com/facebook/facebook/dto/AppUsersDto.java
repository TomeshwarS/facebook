package com.facebook.facebook.dto;

public class AppUsersDto {

	public AppUsersDto() {

		System.out.println("AppUsersDto--Constructor");
	}
	private Integer id;

	private String fname;
	private String mname;

	private String lname;

	private String email;

	private String pass;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "AppUsers [id=" + id + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", email=" + email
				+ ", pass=" + pass + "]";
	}
}
