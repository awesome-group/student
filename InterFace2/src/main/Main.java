package main;

public class Main {

	public static void main(String[] args) {
		Student s=new Student("Togrul","8a",9,"Fizika","Tunzale");
		System.out.println("Telebenin adi "+s.getStudentName()+" sinif adi "+s.getClassName()+" qiymeti " + s.getPrice()
		+ " fennin adi "+s.getSubject()+" muellimin adi "+s.getTeacherName());
	}

}
