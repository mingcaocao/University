package university;

public class Testing {
	
	public static void main(String[] args) {
		/**
		 * create new student class
		 */
		Student student1 =  new Student("alpha", 2018);
		/**
		 * let student take cit590
		 */
		student1.takeCourse("cis110");
		/**
		 * create new TA class
		 */
		TA ta110 = new TA("beta", "cis110");
		/**
		 * ta1 pick office hours at 3 on Monday
		 */
		ta110.pickOfficeHours("Monday", 3);
		/**
		 * ta1 pick recitation time at 11
		 */
		ta110.pickRecitationTime(11);
		/**
		 * assign recitation ta1 as TA of student1 and display recitation time
		 */
		student1.assignRecitationTA(ta110);
		/**ta1 grade student1 as A
		 * 
		 */
		ta110.gradeStudent(student1, "A");
		/**
		 * print student1 report
		 */
		student1.printReport();
		/**
		 * studnet1 take cis120
		 */
		student1.takeCourse("cis120");
		/**
		 * create new TA class ta2
		 */
		TA ta120 =  new TA("gamma", "cis120");
		/**
		 * ta2 pick office hours at 1 on Tuesday
		 */
		ta120.pickOfficeHours("Tuesday", 1);
		/**
		 * ta2 pick recitation time at 3
		 */
		ta120.pickRecitationTime(3);
		/**
		 * assign ta2 to student1 and display ta2 recitation time
		 */
		student1.assignRecitationTA(ta120);
		/**
		 * ta2 grade student1 B+
		 */
		ta120.gradeStudent(student1, "B+");
		/**
		 * print student1's report again
		 */
		student1.printReport();
		/**
		 * change ta110's office hour time
		 */
		ta110.pickOfficeHours("Tuesday", 4);
		/**
		 * display the changed office hour time
		 */
		ta110.displayOfficeHours();
		/**
		 * display whether or not student is eligible for the dean's list
		 */
		if(student1.isEligibleForDeanList()){
			System.out.println(student1.getName() + " is eligible for the dean's list");
		}
		else{
			System.out.println(student1.getName() + " is not eligible for the dean's list");
		}
	}

}
