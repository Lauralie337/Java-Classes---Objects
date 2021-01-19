package com.tts.components;

public class CustomKeyboards {

    //Minimum of 3 private instance variables
    private String brand;
    private String model;
    private int price;
    private boolean mechanical;
    private boolean RGB;

    // Empty constructor
    public CustomKeyboards() {
        brand = "The company you gave all your money too";
        model = "the exact kb that stole all your money";
        price = 20;
        mechanical = false;
        RGB = false;
        VerifyMech();
        DoesItLightUp();
    }

    // Constructor using 2 variables
    public CustomKeyboards(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Constructor using all variables
    public CustomKeyboards(String brand, String model, int price, boolean mechanical, boolean RGB) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.mechanical = mechanical;
        this.RGB = RGB;
    }

    // Getters and Setters
    public String getBrand() { return brand; }

    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public boolean isMechanical() { return mechanical; }

    public void setMechanical(boolean mechanical) { this.mechanical = mechanical; }

    public boolean isRGB() { return RGB; }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }
    // End Getters and Setters



    // To be able to print anuthing at all
    @Override
    public String toString() {
        return "CustomKeyboards{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", mechanical=" + mechanical +
                ", RGB=" + RGB +
                '}';
    }

//    // Example entry using public method
//    public CustomKeyboards(String[] args) {
//        CustomKeyboards corsairK70 = new CustomKeyboards();
//        corsairK70.brand = "Corsair";
//        corsairK70.model = "K70";
//        corsairK70.price = 100;
//        corsairK70.mechanical = true;
//        corsairK70.RGB = false;
//    }

    // This method will return the results of a boolean check
    // However, I can't seem to get it to output via Main.java
    // Would I do another toString() specifically for this??
    // Figured it out, I'm just stupid lol
    public String VerifyMech() {
        if (!mechanical) {
            System.out.println("Ahhh, you should really get a mechanical keyboard instead!");
        } else {
            System.out.println("Good choice! I hope you got good keys :)");
        }
        return VerifyMech();
    }

    // This method will return a string when applicable
    public String DoesItLightUp() {
        if(RGB) {
            System.out.println("Taste the rainbow.");
        }
        return DoesItLightUp();
    }
}