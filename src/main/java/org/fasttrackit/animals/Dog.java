package org.fasttrackit.animals;

public class Dog extends Animal{

    private String dogBreed;
    private boolean needsAWalk;

    public Dog(String name, boolean hasAOwner){
        super(name, hasAOwner);
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public boolean isNeedsAWalk() {
        return needsAWalk;
    }

    public void setNeedsAWalk(boolean needsAWalk) {
        this.needsAWalk = needsAWalk;
    }

    @Override
    public void showHappiness(Animal animal){
        System.out.println(animal.getName() + " is happy, so it is wagging its tail.");
    }
}
