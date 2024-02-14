package MyClasses;

public class MedicalRecord {
    private Location[] location = new Location[3];
    private String treatmentDetails;
    private String dateOfTreatment;

    /* Constructors */
    public MedicalRecord(Location[] location, String treatmentDetails, 
    String dateOfTreatment){
        this.setPersonOne();
        this.setRelationshipTo();
        this.setPersonTwo();
    }

    /* Setters */
    public void setLocation(Location[] location){

    }

    public void setTreatmentDetails(String treatmentDetails){

    }

    public void setDateOfTreatment(String dateOfTreatment){

    }


    /* Getters */

    public Location[] getLocation() {return location;}
    public String getTreatmentDetails() {return this.treatmentDetails;}
    public String getDateOfTreatment() {return this.dateOfTreatment;}
}
