package study.practice.practice33;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
//		s1.department = "컴공";
//		s1.studentNumber = 202501005;
//		
//		System.out.printf("%s학과 학번:%d\n", s1.department, s1.studentNumber);
		
		s1.setDepartment("컴공");
		s1.setStudentNumber(202501005);
		
		System.out.printf("%s학과 학번:%d\n", s1.getDepartment(), s1.getStudentNumber());
	}

}
