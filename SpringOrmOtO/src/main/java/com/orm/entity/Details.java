package com.orm.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="details")
public class Details {
	int did;
	String city, state;
	Student s;
	public Details(int did, String city, String state, Student s) {
		super();
		this.did = did;
		this.city = city;
		this.state = state;
		this.s = s;
	}
	
	
}
