package odev2;

public class Instructor extends User {
	
	String instructorName;
	
	public Instructor(int id, String mail, String userName, String password,  String instructorName) {
		super(id, mail, userName, password);
		
		this.instructorName = instructorName;
	}
	

}
