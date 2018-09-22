
public class Course extends RaceStuff {

	private String courseName;
	private double courseDistance;
	
	public Course(){
		super();
		courseName = "";
		courseDistance = 0;
		updateType = new ItUpdates();
	}
	
	
	public String getCourseName(){
		return courseName;
	}
	public void setCourseName(String newCourseName){
		 courseName  = newCourseName;
	}
	
	public double getCourseDistance(){
		return courseDistance;
	}
	public void setCourseDistance(double newCourseDistance){
		courseDistance  = newCourseDistance;
	}
}
