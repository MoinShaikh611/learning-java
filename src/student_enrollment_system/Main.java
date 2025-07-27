package student_enrollment_system;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("John", "S101");
		Student s2 = new Student("Alice", "S102");
		Student s3 = new Student("Bob", "S103");
		
		Course c1 = new Course("Java", "C101");
		Course c2 = new Course("Python", "C102");
		Course c3 = new Course("Pascal", "C103");
		
		
		EnrollmentService enrollmentService = new EnrollmentService();
		
		enrollmentService.enrollCourseToStudent(s1,c1);
		enrollmentService.enrollCourseToStudent(s1,c2);
		enrollmentService.enrollCourseToStudent(s1,c3);
		enrollmentService.enrollCourseToStudent(s2,c1);
		enrollmentService.enrollCourseToStudent(s2,c3);
		enrollmentService.enrollCourseToStudent(s3,c2);
		
		System.out.println(enrollmentService.getStudentCourses()); 
		System.out.println(enrollmentService.getCoursesStudens()); 
		
	}

}
