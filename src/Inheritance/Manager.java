package Inheritance;

public class Manager extends Person{
    private final String bonus;

    public Manager(String name, String surName, int age,String bonus) {
        super(name, surName, age);
        this.bonus=bonus;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bonus:" + bonus);
    }
}
