package com.schoolproject.user;

import java.io.Serializable;

public class LoginUser implements Serializable{
	private static final long serialVersionUID = 1L;
    private String name;
    private String emailid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
}
