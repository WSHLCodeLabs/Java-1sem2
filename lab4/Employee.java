package Lib;

public class Employee extends People {
    private String company;
    private double salary;
    
    public String getCompany(){
        return this.company;
    }
    public double getSalary(){
        if (salary <= 0) {
            System.out.println("Can't set salary");
        }
        return this.salary;
   
    }
    
    public void setCompany(String company){
        this.company = company;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public boolean Taxpay(){
        if ((salary - 200000) == 0){
        }
        return this.Taxpay();
    }
    
    public void Show(){
        
        System.out.println(this.Taxpay());
    }
    
    public void setName(String firstname,String lastname) {
        this.setFirstName(firstname);
        this.setLastName(lastname);
    }
    public void setBirthdate(int day,int month,int year){
        birthdate.setDate(day, month, year);
    }

}
