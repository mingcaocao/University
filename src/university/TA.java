package university;

public class TA {
	/**
	 * instance variables
	 */
	String name;
	String course;
	String officeHourDay;
	int officeHourTime;
	int recitationTime;
	/**
	 * initialize variables
	 * @param taName - name of ta
	 * @param courseName - name of course
	 */
	public TA(String taName, String courseName){
		this.name = taName;
		this.course = courseName;
		this.officeHourDay = "unknown";
		this.officeHourTime = 0;
		this.recitationTime = 0;
	}
	
	/**
	 * set the office hour for TA
	 * @param day - the day of office hour
	 * @param start - the time that starts office hour
	 */
	public void pickOfficeHours(String day, int start){
		this.officeHourDay = day;
		this.officeHourTime = start;
	}
	/**
	 * set the recitation time for TA
	 * @param start - time starting recitation
	 */
	public void pickRecitationTime(int start){
		this.recitationTime = start;
	}
	/**
	 * get TA name
	 * @return TA name
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * get TA recitation time
	 * @return recitation tiem
	 */
	public int getRecitationTime(){
		return this.recitationTime;
	}
	/**
	 * print TA office hour
	 */
	public void displayOfficeHours(){
		System.out.println("office hours " + this.officeHourDay + " from " + (this.officeHourTime) + " to " + (this.officeHourTime + 2));
	}
	/**
	 * grade student
	 * @param student - name of student who is graded
	 * @param grade - the grade student got
	 */
	public void gradeStudent(Student student, String grade){
		student.recieveGrade(this.course, grade);
	}
	
}
