package org.fasttrackit;

import java.time.LocalDate;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Adopter adopter1 = new Adopter("Marcel");
        adopter1.amountOfMoneyAvailable = 320;
        System.out.println("Adaptor name: " + adopter1.name);
        System.out.println("Amount of money available: "+ adopter1.amountOfMoneyAvailable);
        System.out.println();

        Adopter adopter2 = new Adopter("Andrei");
        adopter2.amountOfMoneyAvailable = 500;
        System.out.println("Adaptor name: " + adopter2.name);
        System.out.println("Amount of money available: "+ adopter2.amountOfMoneyAvailable);
        System.out.println();

        Adopter adopter3 = new Adopter("Tudor");
        adopter3.amountOfMoneyAvailable = 125.30;
        System.out.println("Adaptor name: " + adopter3.name);
        System.out.println("Amount of money available: "+ adopter3.amountOfMoneyAvailable);
        System.out.println();

        Adopter adopter4 = new Adopter("Ionut");
        adopter4.amountOfMoneyAvailable = 200.60;
        System.out.println("Adaptor name: " + adopter4.name);
        System.out.println("Amount of money available: "+ adopter4.amountOfMoneyAvailable);
        System.out.println();



        Dog dog1 = new Dog("Bindi",false);
        dog1.dogBreed = "Beagle";
        dog1.needsAWalk = new Random().nextBoolean();
        dog1.age = 2;
        dog1.healthLevel = new Random().nextInt(10);
        dog1.hungerLevel = new Random().nextInt(10);
        dog1.moodLevel = new Random().nextInt(10);
        dog1.FavoriteFood = "Rio";
        dog1.RecreationalActivity = "Flight";
        System.out.println("Dog name: " + dog1.name);
        System.out.println("Dog breed: " + dog1.dogBreed);
        System.out.println("Does the dog need a walk? " + dog1.needsAWalk);
        System.out.println("Does the dog have a owner? " + dog1.hasAnOwner);
        System.out.println("Age: " + dog1.age + " years.");
        System.out.println("Level of healt: " + dog1.healthLevel);
        System.out.println("The level of feeling hungry: "  + dog1.hungerLevel);
        System.out.println("Mood level: " + dog1.moodLevel);
        System.out.println("The name of favorite food: " + dog1.FavoriteFood);
        System.out.println("The name of the preferred recreational activity: " + dog1.RecreationalActivity);
        System.out.println();

        Dog dog2 = new Dog("Bruno",false);
        dog2.dogBreed = "Akita Japonez";
        dog2.needsAWalk = new Random().nextBoolean();
        dog2.age = 5;
        dog2.healthLevel = new Random().nextInt(10);
        dog2.hungerLevel = new Random().nextInt(10);
        dog2.moodLevel = new Random().nextInt(10);
        dog2.FavoriteFood = "Briatos";
        dog2.RecreationalActivity = "Running";
        System.out.println("Dog name: " + dog2.name);
        System.out.println("Dog breed: " + dog2.dogBreed);
        System.out.println("Does the dog need a walk? " + dog2.needsAWalk);
        System.out.println("Does the dog have a owner? " + dog2.hasAnOwner);
        System.out.println("Age: " + dog2.age + " years.");
        System.out.println("Level of healt: " + dog2.healthLevel);
        System.out.println("The level of feeling hungry: "  + dog2.hungerLevel);
        System.out.println("Mood level: " + dog2.moodLevel);
        System.out.println("The name of favorite food: " + dog2.FavoriteFood);
        System.out.println("The name of the preferred recreational activity: " + dog2.RecreationalActivity);
        System.out.println();

        Dog dog3 = new Dog("Elmo",false);
        dog3.dogBreed = "Basenji";
        dog3.needsAWalk = new Random().nextBoolean();
        dog3.age = 1;
        dog3.healthLevel = new Random().nextInt(10);
        dog3.hungerLevel = new Random().nextInt(10);
        dog3.moodLevel = new Random().nextInt(10);
        dog3.FavoriteFood = "Milk";
        dog3.RecreationalActivity = "Sleep";
        System.out.println("Dog name: " + dog3.name);
        System.out.println("Dog breed: " + dog3.dogBreed);
        System.out.println("Does the dog need a walk? " + dog3.needsAWalk);
        System.out.println("Does the dog have a owner? " + dog3.hasAnOwner);
        System.out.println("Age: " + dog3.age + " years.");
        System.out.println("Level of healt: " + dog3.healthLevel);
        System.out.println("The level of feeling hungry: "  + dog3.hungerLevel);
        System.out.println("Mood level: " + dog3.moodLevel);
        System.out.println("The name of favorite food: " + dog3.FavoriteFood);
        System.out.println("The name of the preferred recreational activity: " + dog3.RecreationalActivity);
        System.out.println();

        Dog dog4 = new Dog("Haiduc",false);
        dog4.dogBreed = "Whippet";
        dog4.needsAWalk = new Random().nextBoolean();
        dog4.age = 3;
        dog4.healthLevel = new Random().nextInt(10);
        dog4.hungerLevel = new Random().nextInt(10);
        dog4.moodLevel = new Random().nextInt(10);
        dog4.FavoriteFood = "Purina ONE";
        dog4.RecreationalActivity = "Walk in the park";
        System.out.println("Dog name: " + dog4.name );
        System.out.println("Dog breed: " + dog4.dogBreed);
        System.out.println("Does the dog need a walk? " + dog4.needsAWalk);
        System.out.println("Does the dog have a owner? " + dog4.hasAnOwner);
        System.out.println("Age: " + dog4.age + " years.");
        System.out.println("Level of healt: " + dog4.healthLevel);
        System.out.println("The level of feeling hungry: "  + dog4.hungerLevel);
        System.out.println("Mood level: " + dog4.moodLevel);
        System.out.println("The name of favorite food: " + dog4.FavoriteFood);
        System.out.println("The name of the preferred recreational activity: " + dog4.RecreationalActivity);
        System.out.println();



        Cat cat1 = new Cat("Kenzo",false);
        cat1.eyeColor = "Green";
        cat1.age = 2;
        cat1.healthLevel = new Random().nextInt(10);
        cat1.hungerLevel = new Random().nextInt(10);
        cat1.moodLevel = new Random().nextInt(10);
        cat1.FavoriteFood = "Rio";
        cat1.RecreationalActivity = "Flight";
        System.out.println("Cat name: " + cat1.name);
        System.out.println("Eye color: " + cat1.eyeColor);
        System.out.println("Does the dog have a owner? " + cat1.hasAnOwner);
        System.out.println("Age: " + cat1.age + " years.");
        System.out.println("Level of healt: " + cat1.healthLevel);
        System.out.println("The level of feeling hungry: "  + dog1.hungerLevel);
        System.out.println("Mood level: " + cat1.moodLevel);
        System.out.println("The name of favorite food: " + cat1.FavoriteFood);
        System.out.println("The name of the preferred recreational activity: " + cat1.RecreationalActivity);
        System.out.println();

        Cat cat2 = new Cat("Moti",false);
        cat2.eyeColor = "Green";
        cat2.age = 2;
        cat2.healthLevel = new Random().nextInt(10);
        cat2.hungerLevel = new Random().nextInt(10);
        cat2.moodLevel = new Random().nextInt(10);
        cat2.FavoriteFood = "Rio";
        cat2.RecreationalActivity = "Flight";
        System.out.println("Cat name: " + cat2.name);
        System.out.println("Eye color: " + cat2.eyeColor);
        System.out.println("Does the dog have a owner? " + cat2.hasAnOwner);
        System.out.println("Age: " + cat2.age + " years.");
        System.out.println("Level of healt: " + cat2.healthLevel);
        System.out.println("The level of feeling hungry: "  + cat2.hungerLevel);
        System.out.println("Mood level: " + cat2.moodLevel);
        System.out.println("The name of favorite food: " + cat2.FavoriteFood);
        System.out.println("The name of the preferred recreational activity: " + cat2.RecreationalActivity);
        System.out.println();



        Cat cat3 = new Cat("Moti",false);
        cat3.eyeColor = "Green";
        cat3.age = 2;
        cat3.healthLevel = new Random().nextInt(10);
        cat3.hungerLevel = new Random().nextInt(10);
        cat3.moodLevel = new Random().nextInt(10);
        cat3.FavoriteFood = "Rio";
        cat3.RecreationalActivity = "Flight";
        System.out.println("Cat name: " + cat3.name);
        System.out.println("Eye color: " + cat3.eyeColor);
        System.out.println("Does the dog have a owner? " + cat3.hasAnOwner);
        System.out.println("Age: " + cat3.age + " years.");
        System.out.println("Level of healt: " + cat3.healthLevel);
        System.out.println("The level of feeling hungry: "  + cat3.hungerLevel);
        System.out.println("Mood level: " + cat3.moodLevel);
        System.out.println("The name of favorite food: " + cat3.FavoriteFood);
        System.out.println("The name of the preferred recreational activity: " + cat3.RecreationalActivity);
        System.out.println();



        Cat cat4 = new Cat("Nala",false);
        cat4.eyeColor = "Green";
        cat4.age = 2;
        cat4.healthLevel = new Random().nextInt(10);
        cat4.hungerLevel = new Random().nextInt(10);
        cat4.moodLevel = new Random().nextInt(10);
        cat4.FavoriteFood = "Rio";
        cat4.RecreationalActivity = "Flight";
        System.out.println("Cat name: " + cat4.name);
        System.out.println("Eye color: " + cat4.eyeColor);
        System.out.println("Does the dog have a owner? " + cat4.hasAnOwner);
        System.out.println("Age: " + cat4.age + " years.");
        System.out.println("Level of healt: " + cat4.healthLevel);
        System.out.println("The level of feeling hungry: "  + cat4.hungerLevel);
        System.out.println("Mood level: " + cat4.moodLevel);
        System.out.println("The name of favorite food: " + cat4.FavoriteFood);
        System.out.println("The name of the preferred recreational activity: " + cat4.RecreationalActivity);
        System.out.println();



        PetFood petFood1 = new PetFood("Purina ONE", new Random().nextBoolean());
        petFood1.amount = 10;
        petFood1.price = 18.90;
        petFood1.expirationDate = LocalDate.now();
        System.out.println("Name for pet food:  " + petFood1.name);
        System.out.println("Amount: " + petFood1.amount + " kg.");
        System.out.println("Availability in stock: " + petFood1.availabilityInStock + " kg");
        System.out.println("Price: " + petFood1.price);
        System.out.println("Expiration dade: " + petFood1.expirationDate);
        System.out.println();

        PetFood petFood2 = new PetFood("Royal Canin", new Random().nextBoolean());
        petFood2.amount = 10;
        petFood2.price = 11.75;
        petFood2.expirationDate = LocalDate.now();
        System.out.println("Name for pet food:  " + petFood2.name);
        System.out.println("Amount: " + petFood2.amount + " kg.");
        System.out.println("Availability in stock: " + petFood2.availabilityInStock + " kg");
        System.out.println("Price: " + petFood2.price);
        System.out.println("Expiration dade: " + petFood2.expirationDate);
        System.out.println();

        PetFood petFood3 = new PetFood("Purina Veterinary Diets", new Random().nextBoolean());
        petFood3.amount = 10;
        petFood3.price = 28.32;
        petFood3.expirationDate = LocalDate.now();
        System.out.println("Name for pet food:  " + petFood3.name);
        System.out.println("Amount: " + petFood3.amount + " kg.");
        System.out.println("Availability in stock: " + petFood3.availabilityInStock + " kg");
        System.out.println("Price: " + petFood3.price);
        System.out.println("Expiration dade: " + petFood3.expirationDate);
        System.out.println();

        PetFood petFood4 = new PetFood("Petkult Medium Adult", new Random().nextBoolean());
        petFood4.amount = 10;
        petFood4.price = 18.47;
        petFood4.expirationDate = LocalDate.now();
        System.out.println("Name for pet food:  " + petFood4.name);
        System.out.println("Amount: " + petFood4.amount + " kg.");
        System.out.println("Availability in stock: " + petFood4.availabilityInStock + " kg");
        System.out.println("Price: " + petFood4.price);
        System.out.println("Expiration dade: " + petFood4.expirationDate);
        System.out.println();



        RecreationActivity recreationActivity1 = new RecreationActivity("Sleep");
        System.out.println("Recreation Activity: " + recreationActivity1.name);
        System.out.println();

        RecreationActivity recreationActivity2 = new RecreationActivity("Flight");
        System.out.println("Recreation Activity: " + recreationActivity2.name);
        System.out.println();

        RecreationActivity recreationActivity3 = new RecreationActivity("Walk in the park");
        System.out.println("Recreation Activity: " + recreationActivity3.name);
        System.out.println();

        RecreationActivity recreationActivity4 = new RecreationActivity("Running");
        System.out.println("Recreation Activity: " + recreationActivity4.name);
        System.out.println();



        Veterinarian veterinarian1 = new Veterinarian("Pavel");
        veterinarian1.specialization = "Vet";
        System.out.println("Veterinarian name: " + veterinarian1.name);
        System.out.println("Specialization: " + veterinarian1.specialization);


    }
}
