package com.models;

public class Actor 
{
	private int actorId;
	
	private String actorName;
	
	private String actorEmail;
	
	private double salary;
	
	private String movie;
	
	public Actor() {}

	public Actor(int actorId, String actorName, String actorEmail, double salary, String movie) {
		super();
		this.actorId = actorId;
		this.actorName = actorName;
		this.actorEmail = actorEmail;
		this.salary = salary;
		this.movie = movie;
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getActorEmail() {
		return actorEmail;
	}

	public void setActorEmail(String actorEmail) {
		this.actorEmail = actorEmail;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", actorEmail=" + actorEmail + ", salary="
				+ salary + ", movie=" + movie + "]";
	}

}
