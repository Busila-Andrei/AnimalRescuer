package org.fasttrackit;

public class Adopter {

    String name;
    double amountOfMoneyAvailable;

    public Adopter(String name){
        this.name = name;
    }

    public void feedAnimal(Animal animal,PetFood food){
        System.out.println(this.name + " just gave some " + food.name + "  food to " + animal.name);
        if(food.name.equals(animal.favoriteFood)){
            animal.moodLevel += 1;
        }

    }

    public  void  playWithAnimal(Animal animal, RecreationActivity recreationActivity){
        System.out.println(this.name + " " + recreationActivity.name + " to " + animal.name);
        if(recreationActivity.name.equals(animal.recreationalActivity)){
            animal.moodLevel += 2;
        } else
            animal.moodLevel += 1;
    }
}
