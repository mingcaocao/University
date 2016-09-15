package university;

public class Student {
	/**
	 * set variables type
	 */
	String name;
	int graduationYear;
	double GPA;
	int numCoursesCompleted;
	boolean inGoodStanding;
	TA recitationTA;
	double numericValue;
	String numCoursesString;
	
	/**
	 * initialize variables
	 * @param studentName - give name
	 * @param graduationYear - set graduation year
	 */
	public Student(String studentName, int graduationYear){
		this.name = studentName;
		this.graduationYear = graduationYear;
		this.GPA = 0;
		this.numCoursesCompleted = 0;
		this.inGoodStanding = true;
		this.recitationTA = null;
	}
	
	/**
	 * get name
	 * @return name
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * give student's graduation year
	 * @return graduation year
	 */
	public int getGraduationYear(){
		return this.graduationYear;
	}
	
	/**
	 * change student's graduation year
	 * @param year - new graduation year
	 */
	public void setGraduationYear(int year){
		this.graduationYear = year;
	}
	
	/**
	 * get student's GPA
	 * @return GPA
	 */
	public double getGPA(){
		return this.GPA;
	}
	
	/**
	 * see if the student is eligible for dean list according to the GPA and
	 * if in good standing
	 * @return in good standing or not
	 */
	public boolean isEligibleForDeanList(){
		if( this.GPA > 3.7 & this.inGoodStanding){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * print the course student enrolled in
	 * @param courseName - the course student completed
	 */
	public void takeCourse(String courseName){
		System.out.println(this.name + " is now enrolled in " + courseName);
	}
	
	/**
	 * calculate GPA and course numbers
	 * @param courseName - the course student took
	 * @param grade - the grade student got
	 */
	public void recieveGrade(String courseName, String grade){
		System.out.println(this.name + " got " + grade + " in " + courseName);
		if(grade == "A"){
			numericValue = 4;
		}
		else if(grade == "A-"){
			numericValue = 3.7;
		}
		else if(grade == "B+"){
			numericValue = 3.3;
		}
		else if(grade == "B"){
			numericValue = 3;
		}
		else if(grade == "B-"){
			numericValue = 2.7;
		}
		else if(grade == "C+"){
			numericValue = 2.3;
		}
		else if(grade == "C"){
			numericValue = 2;
		}
		else if(grade == "C-"){
			numericValue = 1.3;
		}
		else if(grade == "D+"){
			numericValue = 1.0;
		}
		this.GPA = (this.GPA * this.numCoursesCompleted + numericValue) / (this.numCoursesCompleted + 1);
		this.numCoursesCompleted += 1;
	}
	
	/**
	 * student cheating would not be in good standing
	 */
	public void caughtCheating(){
		this.inGoodStanding = false;
	}
	/**
	 * print the general info of students
	 */
	public void printReport(){
		System.out.println("This is " + this.name + " UPENN " + this.graduationYear);
		System.out.println("Their GPA is " + this.GPA);
		if ( this.numCoursesCompleted == 1){
			numCoursesString = "course";
		}
		else{
			numCoursesString = "courses";
		}
		System.out.println("They have taken " + this.numCoursesCompleted + " " + numCoursesString);
	}
	/**
	 * assign the TA and tell the recitation time
	 * @param TA - TA class
	 */
	public void assignRecitationTA(TA TA){
		this.recitationTA = TA;
		System.out.println(this.name + " your TA is " + TA.getName() + " whose recitation is at " + TA.getRecitationTime());		
	}
	
}
