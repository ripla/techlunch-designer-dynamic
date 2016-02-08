package com.example.backend;

import java.util.Collection;

public interface Backend {

	/**
	 * Get a list of users in the current room.
	 *
	 */
	Collection<User> getUsers();

	/**
	 * Get a list of messages in the current room.
	 *
	 */
	Collection<Message> getMessages();

}
