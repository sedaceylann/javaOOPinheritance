package odev2;


public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1, "sedacyln@gimal.com", "seda", "8596745858","SedaCeylan","2016123046");
		student1.getStudentName();
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
		
		User user1 = new User(2, "sedacyln@gmail.com", "sdcyln", "123465566558");
		user1.getuserName();
		UserManager userManager = new UserManager();
		userManager.addUser(user1);
		
		Instructor instructor  = new Instructor(3, "engindemirog@gmail.com", "engindmrog", "253641", "Engin Demiroğ");
		instructor.instructorName = "Engin ";
		InstructorManager instructor2 = new InstructorManager();
		instructor2.addInstructor(instructor);
		

		
	}

}
