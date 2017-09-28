package com.mastercard.hibernate.demo6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mastercard.hibernate.demo.entity6.Instructor;
import com.mastercard.hibernate.demo.entity6.InstructorDetail;
import com.mastercard.hibernate.demo.entity6.Review;
import com.mastercard.hibernate.demo.entity6.Student;
import com.mastercard.hibernate.demo.entity6.Course;

public class DeletePacmanCourseDemo {

	public static void main(String[] args) {

		//create session factory 
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		//create session 
		Session session = factory.getCurrentSession();
		
		try {
			//start a transaction
			session.beginTransaction();
			
			//get the student mary from database 
			int studentId = 2;
			Student tempStudent = session.get(Student.class, studentId);
			
			System.out.println("\nLoaded student: " + tempStudent);
			System.out.println("Course: " + tempStudent.getCourses());
			
			//commit transaction
			session.getTransaction().commit();	
			
			System.out.println("Done!");
		}
		finally {
			//add clean up code
			session.close();
			
			factory.close();
		}
	}
}
