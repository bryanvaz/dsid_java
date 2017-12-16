package com.example.sample;

/**
 *
 */
public class SampleProject {
    public static void main(String[] args) {
        //Day1Code.SingleClassCode();
        //Day1Code.InheritenceDemo();
        Day1Code.ExceptionDemo();

    }


}

class Day1Code {
    public static void SingleClassCode() {
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

    public static void InheritenceDemo(){
        Boxer boxer1 = new Boxer(8,"Brown Bear",200);
        Dane dane1 = new Dane();
        System.out.println("Boxer's age is: " + boxer1.getAge());
        Animal a1 = new Dog();
        System.out.println("done");

    }

    public static void ExceptionDemo() {
        Dog nd = new Dog();
        boolean attemptFailed = false;
        int retries = 1;
        int maxRetries = 3;
        do{
            attemptFailed = false;
            try {
                nd.thisThrowsErrors();
            }
            catch (Exception e){
                //e.printStackTrace();
                System.out.println("Attempt #"+ retries +" Caught an error...");
                attemptFailed = true;
                retries++;

            }
        } while( attemptFailed && (retries <= maxRetries));


        System.out.println("\n----- What are the ages----\n");
        System.out.println("Dexter's age: " + nd.getAge());


        System.out.println("done");


    }
}
