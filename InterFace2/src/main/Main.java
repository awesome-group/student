package main;

public class Main {

	public static void main(String[] args) {
		Student s=new Student("Togrul","8a",9,"Fizika","Tunzale");
		s.classOfStudent(s.getStudentName(), s.getClassName());
		s.priceOfStudent(s.getPrice());
		s.subjectOfStudent(s.getSubject(), s.getTeacherName());
	}

}
