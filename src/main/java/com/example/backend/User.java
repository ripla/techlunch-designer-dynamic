package com.example.backend;

public class User {

	private String status;
	private String name;

	public User(String name, String status) {
		this.setName(name);
		this.setStatus(status);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
