package MyClasses;

public class FamilyRelation {
    private DisasterVictim[] personOne = new DisasterVictim[10];
    private String relationshipTo;
    private DisasterVictim[] personTwo = new DisasterVictim[10];

    /* Constructors */
    public FamilyRelation(DisasterVictim[] personOne, String relationshipTo, 
    DisasterVictim[] personTwo){
        this.setPersonOne();
        this.setRelationshipTo();
        this.setPersonTwo();
    }



    /* Setters */
    public void setPersonOne(DisasterVictim[] personOne){

    }

    public void setRelationshipTo(String relationshipTo){

    }

    public void setPersonTwo(DisasterVictim[] personTwo){

    }


    /* Getters */

    public DisasterVictim[] getPersonOne() {
        return personOne;
    }
    public String getRelationshipTo() {return this.relationshipTo;}
    public DisasterVictim[] getPersonTwo(){
        return personTwo;
    }
    
}
