package Inheritance;

public class Person {
    protected String name;
    protected String surName;
    protected int age;

    public Person(String name, String surName, int age){
        this.name=name;
        this.surName=surName;
        this.age=age;
    }
    public void printInfo(){
        System.out.println("Ad Soyad:" + name + " " + surName + "\nYaş:" + age);
    }
}