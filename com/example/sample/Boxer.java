package com.example.sample;

public class Boxer extends Dog {
    int tailLength = 10;

    public Boxer(){
        this.height = "Medium";
    }
    public Boxer(int tailLength){
        super(7,"brown Boxer");
        this.tailLength = tailLength;

    }
    public Boxer(int age, String name, int tailLength){
        //this.age = age;
        //this.name = name;
        super(age,name);
        this.tailLength = tailLength;

    }

    @Override
    public int getAge() {
        return super.getAge() + 1;
    }
}
