package org.fasttrackit;

import org.fasttrackit.animals.Animal;

public class Adopter {

    private String name;
    private double amountOfMoneyAvailable;

    public Adopter(String name){
        this.name = name;
    }

    public void feedAnimal(Animal animal, PetFood food){
        System.out.println(this.name + " just gave some " + food.getName() + "  food to " + animal.getName());
        if(food.getName().equals(animal.getFavoriteFood())){
            animal.setMoodLevel(animal.getMoodLevel() + 1);
        }

    }

    public  void  playWithAnimal(Animal animal, RecreationActivity recreationActivity){
        System.out.println(this.name + " " + recreationActivity.getName() + " to " + animal.getName());
        if(recreationActivity.getName().equals(animal.getRecreationalActivity())){
            animal.setMoodLevel(animal.getMoodLevel() + 2);
        } else
            animal.setMoodLevel(animal.getMoodLevel() + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountOfMoneyAvailable() {
        return amountOfMoneyAvailable;
    }

    public void setAmountOfMoneyAvailable(double amountOfMoneyAvailable) {
        this.amountOfMoneyAvailable = amountOfMoneyAvailable;
    }
}
