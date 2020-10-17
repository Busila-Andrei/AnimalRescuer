package org.fasttrackit;

public class Cat extends Animal{

    private String eyeColor;

    public Cat(String name, boolean hasAOwner){
        super(name, hasAOwner);
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
