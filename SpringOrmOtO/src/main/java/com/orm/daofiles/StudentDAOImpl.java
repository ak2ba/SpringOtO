package com.orm.daofiles;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.orm.entity.Student;

@Component
public class StudentDAOImpl {
	SessionFactory sf;
	
	public StudentDAOImpl(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(Student s)
	{
		
	}
}
