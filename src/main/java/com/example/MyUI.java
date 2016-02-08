package com.example;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.backend.Backend;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

@Theme("mytheme")
@SpringUI
public class MyUI extends UI {

	@Autowired
	private Backend backend;

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		OtherMainDesign main = new OtherMainDesign();

		backend.getUsers().stream()
				.forEach(u -> main.menuItems.addComponent(new UserComponent(u.getName(), u.getStatus())));

		backend.getMessages().stream()
				.forEach(m -> main.content.addComponent(new MessageComponent(m.getSender(), m.getContent())));
		setContent(main);
	}
}
