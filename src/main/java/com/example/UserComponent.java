package com.example;

public class UserComponent extends UserDesign {

	private String name;

	public UserComponent(String name, String status) {
		userNameButton.setCaption(name);
		statusButton.setCaption(status);
	}
}
