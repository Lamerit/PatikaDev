package Inheritance;

public class PersonMain {
    public static void main(String[] args) {
        Person[] p = new Person[3];

        p[0]= new Person("Hamza", "ÖLGEN", 30);
        p[1]= new Employee("Kadir", "KURT", 28, "Yazılım Büro");
        p[2]=new Manager("Musa", "KAÇMAZ", 35, "Müdür");

        for (int i = 0; i <p.length; i++) {
            p[i].printInfo();
            System.out.println();
        }
    }
}
