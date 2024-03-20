package edu.ucaldas.poo.gradebook;

public class gradebookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gradeBook gradeBook1 = new gradeBook("CS101 Introduction to Java Programming" );
		gradeBook gradeBook2 = new gradeBook("CS102 Data Structures in Java" );

		System.out.printf( "gradeBook1 course name is: %s\n", gradeBook1.getCourseName() );
		System.out.printf( "gradeBook2 course name is: %s\n", gradeBook2.getCourseName() );
	}

}
