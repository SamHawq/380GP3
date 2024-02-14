package MyClasses;

public class ReliefService {
    private Inquirer[] inquirer = new Inquirer[4];
    private DisasterVictim[] missingPerson = new DisasterVictim[10];
    private String dateOfInquiry;
    private String infoProvided;
    private Location[] lastKnownLocation = new Location[4];
    

    /* Constructors */
    public ReliefService(Inquirer[] inquirer, 
    DisasterVictim[] missingPerson, String dateOfInquiry, String infoProvided,
    Location[] lastKnownLocation){
        this.setInquirer();
        this.setMissingPerson();
        this.setDateOfInquiry();
        this.setInfoProvided();
        this.setLastKnownLocation();
    }



    /* Setters */
    public void setInquirer(Inquirer[] inquirer){

    }

    public void setMissingPerson(DisasterVictim[] missingPerson){

    }

    public void setDateOfInquiry(String dateOfInquirer){

    }

    public void setInfoProvided(String infoProvided){

    }

    public void setLastKnownLocation(Location[] lastKnownLocation){

    }

    /* Getters */

    public String getInquirer() {return this.inquirer;}
    public DisasterVictim[] getMissingPerson() {return this.missingPerson;}
    public String getDateOfInquiry() {return this.dateOfInquiry;}
    public String getInfoProvided() {return this.infoProvided;}
    public Location[] getLastKnownLocation() {return lastKnownLocation;}
}
