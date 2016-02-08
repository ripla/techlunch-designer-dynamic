package com.example;

public class MessageComponent extends MessageDesign {

	public MessageComponent(String sender, String content) {
		this.nameLabel.setValue(sender);
		this.contentLabel.setValue(content);
	}
}
