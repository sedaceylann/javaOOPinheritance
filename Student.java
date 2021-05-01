package odev2;

public class Student extends User{

	
	private String studentName;
	private String studentNumber;
	
	public Student(int id, String mail, String userName, String password, String studentName, String studentNumber) {
		super(id, mail, userName, password);
		this.studentName = studentName;
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
	
	
	
	
  
	
	
}
