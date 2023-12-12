package Lib;

public class Mydate {
    private int day;
    private int month;
    private int year;
    
    public int getDay(){
        return day;
    }
     public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    
    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        } else System.out.println("Can't set day.");
    }
    public void setMonth(int month) {
       if (month > 0 && month <= 12) {
        this.month = month;
        } else System.out.println("Can't set month.");
    }
    public void setYear(int year) {
        if (year > 0) {
        this.year = year;
        } else System.out.println("Can't set year.");
    }
    public void setDate(int day,int month,int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }
    public String toString(){
        String s = this.day + "/" + this.month + "/" + this.year;
        return s;
    }
}
