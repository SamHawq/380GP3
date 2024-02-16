package edu.ucalgary.oop;



import org.junit.*;

import java.util.Arrays;

public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        this.occupants = new DisasterVictim[0];
        this.supplies = new Supply[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DisasterVictim[] getOccupants() {
        return occupants;
    }

    public void setOccupants(DisasterVictim[] occupants) {
        this.occupants = occupants;
    }

    public Supply[] getSupplies() {
        return supplies;
    }

    public void setSupplies(Supply[] supplies) {
        this.supplies = supplies;
    }

    public void addOccupant(DisasterVictim occupant) {
        DisasterVictim[] newOccupants = Arrays.copyOf(occupants, occupants.length + 1);
        newOccupants[occupants.length] = occupant;
        occupants = newOccupants;
    }

    public void removeOccupant(DisasterVictim occupant) {
        int index = findOccupantIndex(occupant);
        if (index != -1) {
            DisasterVictim[] newOccupants = new DisasterVictim[occupants.length - 1];
            System.arraycopy(occupants, 0, newOccupants, 0, index);
            System.arraycopy(occupants, index + 1, newOccupants, index, occupants.length - index - 1);
            occupants = newOccupants;
        }
    }

    private int findOccupantIndex(DisasterVictim occupant) {
        for (int i = 0; i < occupants.length; i++) {
            if (occupants[i].equals(occupant)) {
                return i;
            }
        }
        return -1;
    }

    public void addSupply(Supply supply) {
        Supply[] newSupplies = Arrays.copyOf(supplies, supplies.length + 1);
        newSupplies[supplies.length] = supply;
        supplies = newSupplies;
    }

    public void removeSupply(Supply supply) {
        int index = findSupplyIndex(supply);
        if (index != -1) {
            Supply[] newSupplies = new Supply[supplies.length - 1];
            System.arraycopy(supplies, 0, newSupplies, 0, index);
            System.arraycopy(supplies, index + 1, newSupplies, index, supplies.length - index - 1);
            supplies = newSupplies;
        }
    }

    private int findSupplyIndex(Supply supply) {
        for (int i = 0; i < supplies.length; i++) {
            if (supplies[i].equals(supply)) {
                return i;
            }
        }
        return -1;
    }
}


