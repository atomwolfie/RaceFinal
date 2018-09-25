package Race;

import java.util.ArrayList;

public class CourseGrabber implements Subject {

	  private ArrayList<Observer> observers;
	    
	    private int bibNumber;

	    private String dateAndTime;
	    
	    private double distanceTraveled;
	    

	    public CourseGrabber(){

	        // Creates an ArrayList to hold all observers

	        observers = new ArrayList<Observer>();

	    }

	    public void register(Observer newObserver) {

	        // Adds a new observer to the ArrayList

	        observers.add(newObserver);

	    }

	    public void unregister(Observer deleteObserver) {

	        // Get the index of the observer to delete

	        int observerIndex = observers.indexOf(deleteObserver);

	        // Print out message (Have to increment index to match)

	        System.out.println("Observer " + (observerIndex+1) + " deleted");

	        // Removes observer from the ArrayList

	        observers.remove(observerIndex);

	    }

	    public void notifyObserver() {

	        // Cycle through all observers and notifies them of

	        // athlete changes

	        for(Observer observer : observers){
	            observer.updateCourse(bibNumber, dateAndTime, distanceTraveled);
	        }

	    }

	    // Change prices for all stocks and notifies observers of changes

	    public void setBibNumber(int newBibNumber){
	        bibNumber = newBibNumber;
	        notifyObserver();
	    }

	    public int getBibNumber(){
	        return bibNumber;
	     }
	    
	    public void setDateandTime(String newDateAndTime){
	        dateAndTime = newDateAndTime;
	        notifyObserver();
	    }
	    
	    public String getDateandTime(){
	    	return dateAndTime;
	    }
	 
	    
	    public void setDistance(double newDistance){
	        distanceTraveled = newDistance;
	        notifyObserver();
	    }

	    public double getDistance(){
	    	return distanceTraveled;
	    }
	   

	    
	   
	
}
