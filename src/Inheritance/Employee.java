package Inheritance;

public class Employee extends Person {
    private final String department;

    public Employee(String name, String surName, int age, String department) {
        super(name,surName,age);
        this.department = department;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Departman:" + department);
    }
}