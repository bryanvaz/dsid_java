package com.example.sample;

/**
 *
 */
public class SampleProject {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Dog dexter = new Dog("12", "dexter");
        Dog spots = new Dog(7,"spots");

        System.out.println("Dexter's name: " + dexter.name);
        System.out.println("Spot's name: " + spots.name);

        System.out.println("\n----- What are the ages----\n");
        System.out.println("Dexter's age: " + dexter.getAge());
        System.out.println("Spot's age: " + spots.getAge());

        System.out.println("----- Setting Dexter to 5 ----");
        System.out.println("Dexter's age is now: " + dexter.setAge(5));
        System.out.println("----- Setting Spots to 10 ----");
        System.out.println("Spot's age is now: " + spots.setAge(10));

        System.out.println("----- Checking Ages ----");
        System.out.println("Dexter's age: " + dexter.getAge());
        System.out.println("Spot's age: " + spots.getAge());

        System.out.println("----- Setting Spots to -10 ----");
        System.out.println("Spot's age is now: " + spots.setAge(-10));

        System.out.println("----- Checking Ages ----");
        System.out.println("Dexter's age: " + dexter.getAge());
        System.out.println("Spot's age: " + spots.getAge());


        /*System.out.println("Dog's age: " + Dog.getAge());
        Dog.setAge(5);
        System.out.println("Dog's age: " + Dog.getAge());
        */

    }
}

class Bird {
    static boolean isAnimal = true;

}
