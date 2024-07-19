package com.orm.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="student")
public class Student {
	int sid;
	String sname, email;
	public Student(int sid, String sname, String email) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
	}
}
