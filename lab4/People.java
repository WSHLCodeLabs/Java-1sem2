package Lib;

public class People extends Mydate{
    private String firstname;
    private String lastname;
    protected Mydate birthdate = new Mydate();
    
    public String getFirstname(){
        return this.firstname;
    }
     public String getLastname(){
        return this.lastname;
    }
    public String getName(){
        return this.firstname + this.lastname;
    }
    public Mydate getBirthdate(){
        return this.birthdate;
    }
    
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void setName(String firstname,String lastname) {
        this.setFirstName(firstname);
        this.setLastName(lastname);
    }
    
    public void setBirthdate(int day,int month,int year){
        birthdate.setDate(day, month, year);
    }
    public String toString(){
        String s = "My name is " + this.firstname + " " + this.lastname
            + ".\nI was born on " + this.birthdate.toString() + ".";
        return s;
    }
    
}

