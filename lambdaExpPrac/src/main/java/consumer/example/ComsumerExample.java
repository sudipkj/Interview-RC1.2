package consumer.example;

import java.util.List;
import java.util.function.Consumer;

import function.complex.Student;
import function.complex.StudentsGrade;

public class ComsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scenario : Print all the statements
		
		Consumer<Student> con = s -> System.out
				.println("Consumer Predefined intereface printing the name : " + s.getName());
		printStudentNames(con, StudentsGrade.getStudentList());
	}
	
	public static void printStudentNames(Consumer<Student> con, List<Student> ls) {
		for (Student student : ls) {
			con.accept(student);
		}
	}

}
