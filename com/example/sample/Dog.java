package com.example.sample;

public class Dog {

    private int age = 0;
    public String name = "No Name";

    public Dog(){
        System.out.println("Hi from the constructor!");
    }

    public Dog(int startAge, String name){
        this.name = name;
        System.out.println("Recieved a Int for " + name +", you're good!");
        age = startAge;
    }

    public Dog(String startAge, String name){
        this.name = name;
        System.out.println("Recieved a String for " + name +", converting to int");
        age = Integer.parseInt(startAge);
    }

    public int getAge(){
        return age;
    }
    public int setAge(int age){

        System.out.println("Age for " + this.name +" is currently (at the beginning): " + this.age);

        if(age < 0){
            System.out.println("Age Cannot be Negative!");
            return this.age;
        }
        else{
            this.age = age;
        }

        System.out.println("Your age is now: " + this.age);
        return this.age;
    }
}
