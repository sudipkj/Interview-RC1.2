package function.complex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentsGrade {

	public static void main(String[] args) {

		// Print grades of all students.
	Function<Student,String> fun =	
			s-> s.getMarks() > 95 ? "Distinction" : s.getMarks() > 85 ? 
					"PASS" : s.getMarks() >70 ? "Just Pass" : "fail";  
	printGrades(fun, new StudentsGrade().getStudentList());
	}

	public static void printGrades(Function<Student, String> fs, List<Student> ls) {
		for (Student s : ls) {
			System.out.println("For student-->> " + s.getName() + "Grade is -->>" + fs.apply(s));
		}
	}
	public List<Student> getStudentList() {
		List<Student> ls = new ArrayList<>();
		ls.add(new Student("Binny", 45));
		ls.add(new Student("Chinny", 55));
		ls.add(new Student("Pinny", 65));
		ls.add(new Student("Ginny", 75));
		ls.add(new Student("Sinny", 85));
		ls.add(new Student("Jinny", 35));

		return ls;
	}

}
