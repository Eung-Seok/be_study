package be_study.quiz.quiz30;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu1 = new Student();
//		stu1.major = "Mathematics";
//		stu1.studentNumber = 20181052;
//		System.out.println(stu1.major);
//		System.out.println(stu1.studentNumber);
		
		stu1.setMajor("Mathematics");
		stu1.setStudentNumber(20181052);
		System.out.println(stu1.getMajor());
		System.out.println(stu1.getStudentNumber());
	}
	

}
