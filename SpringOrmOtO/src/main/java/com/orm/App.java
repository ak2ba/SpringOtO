package com.orm;

import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.daofiles.StudentDAOImpl;
import com.orm.entity.Details;
import com.orm.entity.Student;

public class App {
  public static void main(String[] args) {
	ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");  
	  
    SessionFactory sf = (SessionFactory) ac.getBean("sf");
    
    Student s = new Student(1,"Akhil","akhil@gmail.com");
    Details d = new Details(1,"Banglore","Karnataka",s);
    
    StudentDAOImpl simpl = new StudentDAOImpl(sf);
    simpl.insert(s);
  }
}
