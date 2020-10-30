package org.fasttrackit.service;


import org.fasttrackit.*;
import org.fasttrackit.animals.Cat;
import org.fasttrackit.animals.Dog;
import org.fasttrackit.controller.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Game {
    Adopter adopter;
    Dog dog;
    Cat cat;
    private List<PetFood> availableFood = new ArrayList<>();
    private RecreationActivity[] availableActivities = new RecreationActivity[8];
    //Veterinarian veterinarian = new Veterinarian();

    public void start() {
        System.out.println("Hi! This is the start of the game.");
        System.out.println("We'll begin by creating your adaptor character.");
        System.out.println();

        initAdaptorNameFromUser();
        System.out.println();

        initAnimalNameFromUser();
        System.out.println();

        initFoodFromUser();
        System.out.println();
        foodDisplay();
        System.out.println();

        initActivitiesFromUser();
        System.out.println();
        displayActivities();


    }

    private void initAdaptorNameFromUser() {
        System.out.print("Please enter the name of your adaptor character: ");
        String adoptorName = ScannerUtils.nextLine();
        while (adoptorName.isEmpty()) {
            System.out.println("You entered nothing. Try again.");
            System.out.print("Please enter the name of your adaptor character: ");
            adoptorName = ScannerUtils.nextLine();
        }

        adopter = new Adopter(adoptorName);
        System.out.println("\nGreat! Your character's name will be: " + adopter.getName());
    }

    private void initAnimalNameFromUser() {
        String chooseAnimal;

        System.out.println("What animal do you want to rescued?");
        System.out.println("You can choose between:");
        System.out.println("1. Cat");
        System.out.println("2. Dog");
        System.out.print("What is your choice? ");
        chooseAnimal = ScannerUtils.nextLine();
        while (chooseAnimal.isEmpty() | !chooseAnimal.equals("Cat") & !chooseAnimal.equals("Dog")) {
            System.out.println("You entered nothing. Try again.");
            System.out.print("Please enter the name of your pet: ");
            chooseAnimal = ScannerUtils.nextLine();
            System.out.println();
        }
        System.out.println("Congratulations, you chose an animal!!!");

        String animalName = setNameAnimal();

        switch (chooseAnimal) {
            case "Cat":
                cat = new Cat(animalName, false);
                break;
            case "Dog":
                dog = new Dog(animalName, false);
                break;
        }
    }

    private void initFoodFromUser() {
        int numberOfFoods = getNumberOfFoods();
        System.out.println("The number of foods added will be " + numberOfFoods);

        for (int i = 1; i <= numberOfFoods; i++) {
            System.out.println("Adding food number " + i + ".");

            PetFood food = new PetFood(getFoodNameFromUser());
            food.setPrice(ThreadLocalRandom.current().nextInt(8, 25));
            food.setAmount(ThreadLocalRandom.current().nextInt(15, 100));

            System.out.println("Food number " + i + " was added. The name is: " + food.getName());

            availableFood.add(food);
        }
    }

    public void initActivitiesFromUser() {
        int numberOfActivities = getNumberOfActivities();
        System.out.println("You said you wanted to create " + numberOfActivities + " activities");
        for (int z = 0; z < numberOfActivities; z++) {

            System.out.println("Creating activity " + (z + 1) + ":");

            RecreationActivity activities = new RecreationActivity();
            activities.setName(getActivityNameFromUser());
            availableActivities[z] = activities;

            System.out.println("Activity " + (z + 1) + " was created. It's called " + activities.getName()
                    +  ".");
        }
    }

    private String setNameAnimal() {
        System.out.print("Now, please enter the name you want to give to your rescued animal: ");
        String animalName = ScannerUtils.nextLine();
        while(animalName.isEmpty()){
            System.out.println("You entered nothing. Try again.");
            System.out.print("Please enter the name of your pet: ");
            animalName = ScannerUtils.nextLine();
        }
        System.out.println("Awesome! Your pet's name will be: " + animalName);
        return animalName;
    }

    private int getNumberOfFoods() {
        try {
            System.out.print("How many foods do you want to have? ");
            return ScannerUtils.nextIntAndMoveToNextLine();
        } catch (InputMismatchException e) {
            System.out.println("Numbers, please.");
            return getNumberOfFoods();
        }
    }

    private String getFoodNameFromUser() {
        System.out.print("What's the name of the food? ");
        return ScannerUtils.nextLine();
    }

    private String getActivityNameFromUser() {
        System.out.print("What will be the name of the activity? ");
        return ScannerUtils.nextLine();
    }

    private int getNumberOfActivities() {
        try {
            System.out.print("How many activities do you want to create? ");
            return ScannerUtils.nextIntAndMoveToNextLine();
        } catch (InputMismatchException e) {
            System.out.println("You can count activities in numbers only. Please enter a number!");
            return getNumberOfActivities();
        }
    }

    private void foodDisplay(){
        System.out.println("Food available:");
        for (PetFood food: availableFood)
            System.out.println("The name is: " + food.getName() +
        " quantity is " + food.getAmount() + " kg and  the price is " + food.getPrice() + "$/kg.");
    }

    private void displayActivities(){
        System.out.println("Activities available:");
        for (int i = 0; i < availableActivities.length; i++){
            if(availableActivities[i] != null)
                System.out.println("Activity number " + (i+1) + ": " + availableActivities[i].getName());
        }

    }


}
