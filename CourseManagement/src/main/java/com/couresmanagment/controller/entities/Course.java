package com.couresmanagment.controller.entities;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Course {
	@Id
	private long id;
	private String title;
	private String decscription;

	public Course(long id, String title, String decscription) {
		super();
		this.id = id;
		this.title = title;
		this.decscription = decscription;
	}

	public Course() {
		super();
		
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

	public String getDecscription() {
		return decscription;
	}

	public void setDecscription(String decscription) {
		this.decscription = decscription;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", decscription=" + decscription + "]";
	}

}
