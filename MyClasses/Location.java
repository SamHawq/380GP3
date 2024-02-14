package MyClasses;

public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants = new DisasterVictim[10];
    private Supply[] supplies = new Supply[2];

    /* Constructors */
    public Location(String name, String address){
        this.setName();
        this.setAddress();
    }

    /* Setters */

    public void setAddress(String address){

    }

    public void setOccupants(DisasterVictim[] occupants){

    }

    public void setSupplies(Supply[] supplies){

    }

    /* Getters */

    public String getName() {return this.name;}
    public String getAddress() {return this.address;}
    public DisasterVictim[] getOccupants() {return this.occupants;}
    public Supply[] getSupplies() {return this.supplies;}
}
