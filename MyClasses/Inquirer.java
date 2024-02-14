package MyClasses;

public class Inquirer {
    private String FIRST_NAME;
    private String LAST_NAME;
    private String INFO;
    private String SERVICES_PHONE;

    /* Constructors */
    public Inquirer(String FIRST_NAME, String LAST_NAME, String INFO
    String SERVICES_PHONE){
        this.setFIRST_NAME();
        this.setLAST_NAME();
        this.setINFO();
        this.setSERVICES_PHONE();
    }

    /* Getters */
    public String getFirstName() {return this.FIRST_NAME;}
    public String getLastName() {return this.LAST_NAME;}
    public String getInfo() {return this.INFO;}
    public String getServicesPhone() {return this.SERVICES_PHONE;}
}
