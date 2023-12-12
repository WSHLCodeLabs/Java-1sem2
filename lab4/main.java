import Lib.*;
;

public class Main {

    public static void main(String[] args) {
        People a = new People();
        a.setName("Andrius", "Hutterson");
        a.setBirthdate(21, 06, 2021);
        System.out.println(a.getName());
    }
}
