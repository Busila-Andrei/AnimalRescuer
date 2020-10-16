package org.fasttrackit;

public class Adopter {

    String name;
    double amountOfMoneyAvailable;

    public Adopter(String name){
        this.name = name;
    }

    public void feedAnimal(Animal animal,PetFood food){
        System.out.println(this.name + " just gave some " + food.name + "  food to " + animal.name);

    }

    public  void  playWithAnimal(Animal animal, RecreationActivity recreationActivity){
        System.out.println(this.name + " " + recreationActivity.name + " to " + animal.name);
        animal.moodLevel++;
    }
}
