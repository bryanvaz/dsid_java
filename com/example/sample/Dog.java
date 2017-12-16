package com.example.sample;

public class Dog implements Animal {

    private int age = 0;
    public String name = "No Name";
    protected String height = "Unknown";

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


    public boolean equals(Object obj) {
        Dog comparedDog = (Dog)obj;
        System.out.println("Orgiginal Name: " + this.name);
        System.out.println("Compared Name: " + comparedDog.name);
        return this.name.equalsIgnoreCase(comparedDog.name);
    }

    public int getNumberOfLegs(){
        return 0;
    }
    public int setNumberOfLegs(){
        return 0;
    }

    public void thisThrowsErrors() throws Exception {
        System.out.println("I'm going to throw an error!");
        throw new Exception("Crazy Error!!!");
        //System.out.println("This code never reached");
    }
}
