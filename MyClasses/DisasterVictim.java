package MyClasses;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords = new MedicalRecord[3]; //what does array length entail
    private FamilyRelation[] familyConnections = new FamilyRelation[3];
    private String ENTRY_DATE;
    private Supply[] personalBelongings = new Supply[2];
    private String gender;
    private int counter;    //underlined in UML

    /* Constructors */
    public DisasterVictim(String firstName, String ENTRY_DATE){
        this.setFirstName();
        this.setENTRY_DATE();
    }



    /* Setters */
    public void setFirstName(String firstName){

    }

    public void setLastName(String lastName){

    }

    public void setDateofBirth(String dateOfBirth){

    }

    public void setComments(String comments){

    }

    public void setMedicalRecords(String medicalRecords){

    }

    public void setPersonalBelongings(String personalBelongings){

    }

    public void setFamilyConnections(String familyConnections){

    }

    public void setGender(String gender){

    }

    /* Getters */
    
    public String getFirstName() {return this.firstName;}
    public String getLastName() {return this.lastName;}
    public String getDateOfBirth() {return this.dateOfBirth;}
    public String getComments() {return this.comments;}
    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }
    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }
    public FamilyRelation[] getFamilyConnections(){
        return familyConnections;
    }
    public String getGender() {return this.gender;}
    
}





