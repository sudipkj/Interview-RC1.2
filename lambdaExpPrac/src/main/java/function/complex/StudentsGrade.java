package function.complex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentsGrade {

	public static void main(String[] args) {

		// Print grades of all students.
		Function<Student, String> fun = s -> s.getMarks() > 95 ? "Distinction"
				: s.getMarks() > 85 ? "PASS" : s.getMarks() > 70 ? "Just Pass" : "fail";
		printGrades(fun, new StudentsGrade().getStudentList());

		// Scenario 2 : Print results in bengali language

		Function<Student, String> benResultfun = (s) -> s.getMarks() > 90 ? "Khoob Bhalo"
				: s.getMarks() > 70 ? "THeek acche" : s.getMarks() < 60 ? "Bekar" : "Pagol bacha";
				
		printInBengali(benResultfun, getStudentList());

	}

	public static void printInBengali(Function<Student, String> benResultFun, List<Student> ls) {

		for (Student student : ls) {
			System.out.println("Studentr name is " + student.getName() + "Bengalis grade : " + benResultFun.apply(student));
		}
	}

	public static void printGrades(Function<Student, String> fs, List<Student> ls) {
		for (Student s : ls) {
			System.out.println("For student-->> " + s.getName() + "Grade is -->>" + fs.apply(s));
		}
	}

	public static List<Student> getStudentList() {
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
