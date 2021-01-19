package com.tts.components;

public class Pet {

    // Private instance variables
    private String name;
    private int age;
    private String location;
    private String type;

    // First empty constructor
    public Pet() {
        name = "placeholder name";
        age = 1;
        location = "anywhere";
        type = "any";

    }
    // Second empty constructor
    public void PetDog() {
        name = "placeholder name";
        age = 1;
        location = "anywhere";
        type = "doggos only";

    }

    public Pet(String name, int age, String location, String type){
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) { this.location = location; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }
    // End Getters and Setters


    // To be able to print anything at all
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

           //Example public
//    public Pet(String[] args) {
//        // write your code here
//        Pet myPet = new Pet();
//        myPet.name = "Shippo";
//        myPet.age = 6;
//        myPet.location = "Shreveport";
//        myPet.type = "idk what this is";
//    }
}
