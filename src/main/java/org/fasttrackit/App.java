package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Adopter adopter1 = new Adopter();
        adopter1.name = "Marcel";
        adopter1.amountOfMoneyAvailable = 320;
        System.out.println("Adaptor name: " + adopter1.name);
        System.out.println("Amount of money available: "+ adopter1.amountOfMoneyAvailable);
        System.out.println();




        Adopter adopter2 = new Adopter();
        adopter2.name = "Andrei";
        adopter2.amountOfMoneyAvailable = 500;
        System.out.println("Adaptor name: " + adopter2.name);
        System.out.println("Amount of money available: "+ adopter2.amountOfMoneyAvailable);
        System.out.println();



        Adopter adopter3 = new Adopter();
        adopter3.name = "Tudor";
        adopter3.amountOfMoneyAvailable = 125.30;
        System.out.println("Adaptor name: " + adopter3.name);
        System.out.println("Amount of money available: "+ adopter3.amountOfMoneyAvailable);
        System.out.println();

        Adopter adopter4 = new Adopter();
        adopter4.name = "Ionut";
        adopter4.amountOfMoneyAvailable = 200.60;
        System.out.println("Adaptor name: " + adopter4.name);
        System.out.println("Amount of money available: "+ adopter4.amountOfMoneyAvailable);
        System.out.println();

        Animal animal1 = new Animal();
        animal1.name = "Paco";
        animal1.age = 2;
        animal1.levelOfHealt = 10;
        animal1.theLevelOfFeelingHungry = 1;
        animal1.moodLevel = 8;
        animal1.theNameOfFavoriteFood = "Rio";
        animal1.theNameOfThePreferredRecreationalActivity = "Flight";
        System.out.println("Animal name: " + animal1.name);
        System.out.println("Age: " + animal1.age);
        System.out.println("Level of healt: " + animal1.levelOfHealt);
        System.out.println("The level of feeling hungry: "  + animal1.theLevelOfFeelingHungry);
        System.out.println("Mood level: " + animal1.moodLevel);
        System.out.println("The name of favorite food: " + animal1.theNameOfFavoriteFood);
        System.out.println("The name of the preferred recreational activity: " + animal1.theNameOfThePreferredRecreationalActivity);
        System.out.println();

        Animal animal2 = new Animal();
        animal2.name = "Asha";
        animal2.age = 5;
        animal2.levelOfHealt = 8;
        animal2.theLevelOfFeelingHungry = 4;
        animal2.moodLevel = 6;
        animal2.theNameOfFavoriteFood = "Briatos";
        animal2.theNameOfThePreferredRecreationalActivity = "Running";
        System.out.println("Animal name: " + animal2.name);
        System.out.println("Age: " + animal2.age);
        System.out.println("Level of healt: " + animal2.levelOfHealt);
        System.out.println("The level of feeling hungry: "  + animal2.theLevelOfFeelingHungry);
        System.out.println("Mood level: " + animal2.moodLevel);
        System.out.println("The name of favorite food: " + animal2.theNameOfFavoriteFood);
        System.out.println("The name of the preferred recreational activity: " + animal2.theNameOfThePreferredRecreationalActivity);
        System.out.println();


        Animal animal3 = new Animal();
        animal3.name = "Bobo";
        animal3.age = 1;
        animal3.levelOfHealt = 6;
        animal3.theLevelOfFeelingHungry = 3;
        animal3.moodLevel = 5;
        animal3.theNameOfFavoriteFood = "Milk";
        animal3.theNameOfThePreferredRecreationalActivity = "Sleep";
        System.out.println("Animal name: " + animal3.name);
        System.out.println("Age: " + animal3.age);
        System.out.println("Level of healt: " + animal3.levelOfHealt);
        System.out.println("The level of feeling hungry: "  + animal3.theLevelOfFeelingHungry);
        System.out.println("Mood level: " + animal3.moodLevel);
        System.out.println("The name of favorite food: " + animal3.theNameOfFavoriteFood);
        System.out.println("The name of the preferred recreational activity: " + animal3.theNameOfThePreferredRecreationalActivity);
        System.out.println();

        Animal animal4 = new Animal();
        animal4.name = "Bruno";
        animal4.age = 3;
        animal4.levelOfHealt = 10;
        animal4.theLevelOfFeelingHungry = 1;
        animal4.moodLevel = 10;
        animal4.theNameOfFavoriteFood = "Purina ONE";
        animal4.theNameOfThePreferredRecreationalActivity = "Walk in the park";
        System.out.println("Animal name: " + animal4.name);
        System.out.println("Age: " + animal4.age);
        System.out.println("Level of healt: " + animal4.levelOfHealt);
        System.out.println("The level of feeling hungry: "  + animal4.theLevelOfFeelingHungry);
        System.out.println("Mood level: " + animal4.moodLevel);
        System.out.println("The name of favorite food: " + animal4.theNameOfFavoriteFood);
        System.out.println("The name of the preferred recreational activity: " + animal4.theNameOfThePreferredRecreationalActivity);
        System.out.println();

        PetFood petFood1 = new PetFood();
        petFood1.name = "Purina ONE";
        petFood1.amount = 10;
        petFood1.availabilityInStock = 20;
        petFood1.price = 18.90;
        petFood1.expirationDate = LocalDate.now();
        System.out.println("Name for pet food:  " + petFood1.name);
        System.out.println("Amount: " + petFood1.amount + " kg.");
        System.out.println("Availability in stock: " + petFood1.availabilityInStock + " kg");
        System.out.println("Price: " + petFood1.price);
        System.out.println("Expiration dade: " + petFood1.expirationDate);
        System.out.println();

        PetFood petFood2 = new PetFood();
        petFood2.name = "Royal Canin";
        petFood2.amount = 10;
        petFood2.availabilityInStock = 20;
        petFood2.price = 11.75;
        petFood2.expirationDate = LocalDate.now();
        System.out.println("Name for pet food:  " + petFood2.name);
        System.out.println("Amount: " + petFood2.amount + " kg.");
        System.out.println("Availability in stock: " + petFood2.availabilityInStock + " kg");
        System.out.println("Price: " + petFood2.price);
        System.out.println("Expiration dade: " + petFood2.expirationDate);
        System.out.println();

        PetFood petFood3 = new PetFood();
        petFood3.name = "Purina Veterinary Diets";
        petFood3.amount = 10;
        petFood3.availabilityInStock = 20;
        petFood3.price = 28.32;
        petFood3.expirationDate = LocalDate.now();
        System.out.println("Name for pet food:  " + petFood3.name);
        System.out.println("Amount: " + petFood3.amount + " kg.");
        System.out.println("Availability in stock: " + petFood3.availabilityInStock + " kg");
        System.out.println("Price: " + petFood3.price);
        System.out.println("Expiration dade: " + petFood3.expirationDate);
        System.out.println();

        PetFood petFood4 = new PetFood();
        petFood4.name = "Petkult Medium Adult";
        petFood4.amount = 10;
        petFood4.availabilityInStock = 20;
        petFood4.price = 18.47;
        petFood4.expirationDate = LocalDate.now();
        System.out.println("Name for pet food:  " + petFood4.name);
        System.out.println("Amount: " + petFood4.amount + " kg.");
        System.out.println("Availability in stock: " + petFood4.availabilityInStock + " kg");
        System.out.println("Price: " + petFood4.price);
        System.out.println("Expiration dade: " + petFood4.expirationDate);
        System.out.println();

        RecreationActivity recreationActivity1 = new RecreationActivity();
        recreationActivity1.name = "Sleep";
        System.out.println("Recreation Activity: " + recreationActivity1.name);
        System.out.println();

        RecreationActivity recreationActivity2 = new RecreationActivity();
        recreationActivity2.name = "Flight";
        System.out.println("Recreation Activity: " + recreationActivity2.name);
        System.out.println();

        RecreationActivity recreationActivity3 = new RecreationActivity();
        recreationActivity3.name = "Walk in the park";
        System.out.println("Recreation Activity: " + recreationActivity3.name);
        System.out.println();

        RecreationActivity recreationActivity4 = new RecreationActivity();
        recreationActivity4.name = "Running";
        System.out.println("Recreation Activity: " + recreationActivity4.name);
        System.out.println();





    }
}
