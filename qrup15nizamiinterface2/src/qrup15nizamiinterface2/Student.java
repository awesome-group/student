package qrup15nizamiinterface2;

public class Student implements Sutdentsint {
    private	String studentName;
    private String className;
    private int price;
    private String subject;
    private String teacherName;
    
	public Student(String studentName, String className, int price, String subject, String teacherName) {
		this.studentName = studentName;
		this.className = className;
		this.price = price;
		this.subject = subject;
		this.teacherName = teacherName;
	}


	@Override
	public String classOfStudent() {
		return "telebenin adi:" +" "+ studentName + " " + "Sinifi:" + " "+ className;
	}

	@Override
	public String priceOfStudent() {
		
		return "Orta Qiymet:"+ " " + price;
	}

	@Override
	public String subjectOfStudent() {

		return "Fenn:" +" "+ subject + " " + "Muellimin adi:" +" "+ teacherName;
	}


	

}
