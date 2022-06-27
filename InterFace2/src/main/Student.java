package main;

public class Student implements StudentInterface {

	private String studentName;
	private String className;
	private int price;
	private String subject;
	private String teacherName;

	public Student(String studentName, String className, int price, String subject, String teacherName) {
		super();
		this.studentName = studentName;
		this.className = className;
		this.price = price;
		this.subject = subject;
		this.teacherName = teacherName;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getClassName() {
		return className;
	}

	public int getPrice() {
		return price;
	}

	public String getSubject() {
		return subject;
	}

	public String getTeacherName() {
		return teacherName;
	}

	@Override
	public void classOfStudent(String studentName, String className) {
		System.out.println(" Telebenin adi " +studentName + " sinif adi " + className);
	}

	@Override
	public void priceOfStudent(int price) {
		System.out.println(" qiymeti " + price);
	}

	@Override
	public void subjectOfStudent(String subject, String teacherName) {
		System.out.println(" fennin adi " + subject + " muellimin adi " + teacherName);
	}

}
