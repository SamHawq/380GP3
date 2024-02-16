package edu.ucalgary.oop;

import java.util.Objects;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    private static int counter;
    private static final String REGEX = "^\\d{4}-\\d{2}-\\d{2}$";
    private static final Pattern PATTERN = Pattern.compile(REGEX);

    public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException {
        Matcher matcher = PATTERN.matcher(ENTRY_DATE);
        if (matcher.matches()) {
            this.firstName = firstName;
            this.ENTRY_DATE = ENTRY_DATE;
            // Initialize arrays with empty arrays
            this.medicalRecords = new MedicalRecord[0];
            this.familyConnections = new FamilyRelation[0];
            this.personalBelongings = new Supply[0];
            this.ASSIGNED_SOCIAL_ID = counter;
            DisasterVictim.counter += 1;
        } else {
            throw new IllegalArgumentException("Invalid date format: " + ENTRY_DATE);
        }
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
        if (!isValidDateFormat(dateOfBirth)) {
            throw new IllegalArgumentException("Invalid date format");
        }

        this.dateOfBirth = dateOfBirth;
    }

    private boolean isValidDateFormat(String date) {
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }



    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setAssignedSocialID(int socialID) {
        if (socialID <= 0) {
            throw new IllegalArgumentException("Social ID must be a positive integer");
        }
        this.ASSIGNED_SOCIAL_ID = socialID;
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
        for (Supply personalBelonging : personalBelongings) {
            if (!personalBelonging.equals(supply)) {
                newPersonalBelongings[index++] = personalBelonging;
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
        for (FamilyRelation family : familyConnections) {
            if (!family.equals(familyConnection)) {
                newFamilyConnections[index++] = family;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisasterVictim otherVictim = (DisasterVictim) obj;
        return Objects.equals(firstName, otherVictim.firstName)
                && Objects.equals(lastName, otherVictim.lastName)
                && Objects.equals(dateOfBirth, otherVictim.dateOfBirth)
                && Objects.equals(ENTRY_DATE, otherVictim.ENTRY_DATE)
                && Objects.equals(gender, otherVictim.gender)
                && ASSIGNED_SOCIAL_ID == otherVictim.ASSIGNED_SOCIAL_ID
                && Arrays.equals(medicalRecords, otherVictim.medicalRecords)
                && Arrays.equals(familyConnections, otherVictim.familyConnections)
                && Arrays.equals(personalBelongings, otherVictim.personalBelongings);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, dateOfBirth, ENTRY_DATE, gender, ASSIGNED_SOCIAL_ID);
        result = 31 * result + Arrays.hashCode(medicalRecords);
        result = 31 * result + Arrays.hashCode(familyConnections);
        result = 31 * result + Arrays.hashCode(personalBelongings);
        return result;
    }
}









