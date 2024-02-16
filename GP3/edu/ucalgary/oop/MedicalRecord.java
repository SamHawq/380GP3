package edu.ucalgary.oop;

import org.junit.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTreatmentDetails() {
        return treatmentDetails;
    }
    public String getDateOfTreatment() {
        return dateOfTreatment;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }





    public void setDateOfTreatment(String dateOfTreatment) {
        // Add a validation check for the date format
        if (!isValidDateFormat(dateOfTreatment)) {
            throw new IllegalArgumentException("Invalid date format");
        }
        this.dateOfTreatment = dateOfTreatment;
    }

    // Other methods...

    private boolean isValidDateFormat(String date) {
        // Implement your date validation logic here
        // For example, you can use SimpleDateFormat to check if the date has a valid format
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);  // This will make sure that the date is validated strictly
            Date parsedDate = sdf.parse(date);
            return true;  // If parsing succeeds, the date is valid
        } catch (ParseException e) {
            return false; // If parsing fails, the date is not valid
        }
    }
}
