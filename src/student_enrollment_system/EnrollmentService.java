package student_enrollment_system;

import java.util.*;

public class EnrollmentService {
	
	private Map<String,List<String>> studentCourses = new HashMap<String, List<String>>();
	private Map<String,List<String>> coursesStudent = new HashMap<String, List<String>>();
	
	public void enrollCourseToStudent(Student student, Course course) {
	    // Add course to student's list
	    List<String> courses = studentCourses.getOrDefault(student.getId(), new ArrayList<>());
	    if (!courses.contains(course.getName())) {
	        courses.add(course.getName());
	    }
	    studentCourses.put(student.getId(), courses);

	    // Add student to course's list
	    List<String> students = coursesStudent.getOrDefault(course.getId(), new ArrayList<>());
	    if (!students.contains(student.getName())) {
	        students.add(student.getName());
	    }
	    coursesStudent.put(course.getId(), students);
	}

	public Map<String,List<String>> getStudentCourses(){
		return studentCourses;
	}
	
	
	public Map<String,List<String>> getCoursesStudens(){
		return coursesStudent;
	}
	
	
}
