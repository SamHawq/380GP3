package edu.ucalgary.oop;

import org.junit.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry,
                         String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    public Inquirer getInquirer() {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }

    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    public String getDateOfInquiry() {
        return dateOfInquiry;
    }

    public void setDateOfInquiry(String dateOfInquiry) {
        // Add a validation check for the date format
        if (!isValidDateFormat(dateOfInquiry)) {
            throw new IllegalArgumentException("Invalid date format");
        }
        this.dateOfInquiry = dateOfInquiry;
    }
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

    public String getInfoProvided() {
        return infoProvided;
    }

    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }

    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }


    public String getLogDetails() {
        // Assuming you want to concatenate relevant details for logging
        return "Inquirer: " + inquirer.getFirstName()
                + ", Missing Person: " + missingPerson.getFirstName()
                + ", Date of Inquiry: " + dateOfInquiry + ", Info Provided: " + infoProvided
                + ", Last Known Location: " + lastKnownLocation.getName();
    }
    
    
    
}
