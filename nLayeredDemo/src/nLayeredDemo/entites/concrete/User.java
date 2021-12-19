package nLayeredDemo.entites.concrete;

import nLayeredDemo.entites.abstacts.Entity;

public class User implements Entity {

	private int userId;
	private String userName;

	public User(int id, String userName) {
		this.userId = id;
		this.userName = userName;
	}

	public int getId() {
		return this.userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserId(int id) {
		this.userId = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
