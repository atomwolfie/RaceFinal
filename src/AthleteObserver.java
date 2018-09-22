// Represents each Observer that is monitoring changes in the subject

public class AthleteObserver implements Observer {

    //int bibNumber, String firstName, String lastName, String gender, int age

	RaceStuff athelete = new Athlete();
	
    private int bibNumber;

    private String dateAndTime;
    
    private String firstName;

    private String lastName;
    
    private String gender;
    
    private int age;

    // Static used as a counter

    private static int observerIDTracker = 0;

    // Used to track the observers

    private int observerID;

    // Will hold reference to the StockGrabber object

    private Subject athleteGrabber;

    public AthleteObserver(Subject athleteGrabber){

        // Store the reference to the stockGrabber object so

        // I can make calls to its methods

        this.athleteGrabber = athleteGrabber;

        // Assign an observer ID and increment the static counter
	this.observerID = ++observerIDTracker;

        // Message notifies user of new observer

        System.out.println("New Observer " + this.observerID);

        // Add the observer to the Subjects ArrayList

        athleteGrabber.register(this);

    }

    // Called to update all observers

    public void update(int bibNumber, String dateAndTime, String firstName, String lastName, String gender, int age) {

        this.bibNumber = bibNumber;

        this.dateAndTime = dateAndTime;
        
        this.firstName = firstName;

        this.lastName = lastName;
        
        this.gender = lastName;
        
        this.age = age;
        
        

        printTheAthletes();

    }

    public void printTheAthletes(){

        System.out.println(observerID + "\nRunner (bib number): " + bibNumber + "\nDate and Time: " + dateAndTime + "\nfirstName: " +

firstName + "\nlastName: " + lastName + "\ngender: " + gender + "\nage: " + age + "\n");

    }

	@Override
	public void updateCourse(int bibNumber, String dateAndTime, double distanceTraveled) {
		// TODO Auto-generated method stub
		
	}

}
