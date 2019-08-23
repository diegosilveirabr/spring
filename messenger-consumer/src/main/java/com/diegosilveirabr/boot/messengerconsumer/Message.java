package com.diegosilveirabr.boot.messengerconsumer;

public class Message {

	private long id;
	private String title;
	private String description;
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Message(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Message [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
}
