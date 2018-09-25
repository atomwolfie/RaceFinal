package Race;
import java.util.ArrayList;


// Uses the Subject interface to update all Observers

public class AthleteGrabber implements Subject{

    private ArrayList<Observer> observers;

    
    private int bibNumber;

    private String dateAndTime;
    
    private String firstName;

    private String lastName;
    
    private String gender;
    
    private int age;
    

    public AthleteGrabber(){

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

            observer.update(bibNumber, dateAndTime, firstName, lastName, gender, age);

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

    
    public void setFirstName(String newFirstName){

        firstName = newFirstName;

        notifyObserver();
  }

   
    public String getFirstName(){
    	return firstName;
    }
    
    
    public void setLastName(String newLastName){
        lastName = newLastName;
        notifyObserver();
    }
    
    public String getLastName(){
    	return lastName;
    }
    
    public void setGender(String newGender){
        gender = newGender;
        notifyObserver();
    }
    
    public String getGender(){
    	return gender;
    }
    
    public void setAge(int newAge){
        age = newAge;
        notifyObserver();
    }

    public int getAge(){
    	return age;
    }


}

