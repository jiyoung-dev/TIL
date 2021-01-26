package com.todo.dto;

public class Todo {
	private int id;
	private String content;
	private boolean done; 
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", content=" + content + ", done=" + done + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

}
