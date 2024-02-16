package edu.ucalgary.oop;

import org.junit.*;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    private int counter;

    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        // Initialize arrays with empty arrays
        this.medicalRecords = new MedicalRecord[0];
        this.familyConnections = new FamilyRelation[0];
        this.personalBelongings = new Supply[0];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getComments() {
        return comments;
    }

    public int getAssignedSocialID() {
        return ASSIGNED_SOCIAL_ID;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }

    public String getEntryDate() {
        return ENTRY_DATE;
    }

    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public void setFamilyConnections(FamilyRelation[] familyConnections) {
        this.familyConnections = familyConnections;
    }

    public void setEntryDate(String ENTRY_DATE) {
        this.ENTRY_DATE = ENTRY_DATE;
    }

    public void setPersonalBelongings(Supply[] personalBelongings) {
        this.personalBelongings = personalBelongings;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void addPersonalBelonging(Supply supply) {
        // Assuming you want to add a personal belonging to the array
        // You might want to implement more logic here (e.g., resizing the array)
        Supply[] newPersonalBelongings = new Supply[personalBelongings.length + 1];
        System.arraycopy(personalBelongings, 0, newPersonalBelongings, 0, personalBelongings.length);
        newPersonalBelongings[personalBelongings.length] = supply;
        personalBelongings = newPersonalBelongings;
    }

    public void removePersonalBelonging(Supply supply) {
        // Assuming you want to remove a personal belonging from the array
        // You might want to implement more logic here (e.g., shifting elements)
        Supply[] newPersonalBelongings = new Supply[personalBelongings.length - 1];
        int index = 0;
        for (int i = 0; i < personalBelongings.length; i++) {
            if (personalBelongings[i] != supply) {
                newPersonalBelongings[index++] = personalBelongings[i];
            }
        }
        personalBelongings = newPersonalBelongings;
    }

    public void addFamilyConnection(FamilyRelation familyConnection) {
        // Similar logic for adding a family connection to the array
        FamilyRelation[] newFamilyConnections = new FamilyRelation[familyConnections.length + 1];
        System.arraycopy(familyConnections, 0, newFamilyConnections, 0, familyConnections.length);
        newFamilyConnections[familyConnections.length] = familyConnection;
        familyConnections = newFamilyConnections;
    }

    public void removeFamilyConnection(FamilyRelation familyConnection) {
        // Similar logic for removing a family connection from the array
        FamilyRelation[] newFamilyConnections = new FamilyRelation[familyConnections.length - 1];
        int index = 0;
        for (int i = 0; i < familyConnections.length; i++) {
            if (familyConnections[i] != familyConnection) {
                newFamilyConnections[index++] = familyConnections[i];
            }
        }
        familyConnections = newFamilyConnections;
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        // Similar logic for adding a medical record to the array
        MedicalRecord[] newMedicalRecords = new MedicalRecord[medicalRecords.length + 1];
        System.arraycopy(medicalRecords, 0, newMedicalRecords, 0, medicalRecords.length);
        newMedicalRecords[medicalRecords.length] = medicalRecord;
        medicalRecords = newMedicalRecords;
    }
}






