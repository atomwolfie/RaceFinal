
public class CourseObserver implements Observer {

 //int bibNumber, String firstName, String lastName, String gender, int age

	
    private int bibNumber;

    private String dateAndTime;
    
    private double distanceTraveled;

    // Static used as a counter

    private static int observerIDTracker = 0;

    // Used to track the observers

    private int observerID;

    // Will hold reference to the StockGrabber object

    private Subject courseGrabber;

    public CourseObserver(Subject courseGrabber){

        // Store the reference to the stockGrabber object so

        // I can make calls to its methods

        this.courseGrabber = courseGrabber;

        // Assign an observer ID and increment the static counter
	this.observerID = ++observerIDTracker;

        // Message notifies user of new observer

        System.out.println("New Observer " + this.observerID);

        // Add the observer to the Subjects ArrayList

        courseGrabber.register(this);

    }

    // Called to update all observers

    public void updateCourse(int bibNumber, String dateAndTime, double distanceTraveled) {

        this.bibNumber = bibNumber;

        this.dateAndTime = dateAndTime;
        
       this.distanceTraveled = distanceTraveled;
       
        printCourses();

    }

    public void printCourses(){

        System.out.println(observerID + "\nRunner: " + bibNumber + "\nDate and Time: " + dateAndTime 
        		+ "\nDistance Traveled: " + distanceTraveled + "\n");

    }

	

	@Override
	public void update(int bibNumber, String dateAndTime, String firstName, String lastName, String gender, int age) {
		// TODO Auto-generated method stub
		
	}
}