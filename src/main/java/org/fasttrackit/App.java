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
        adopter1.setAmountOfMoneyAvailable(320);
        System.out.println("Adaptor name: " + adopter1.getName());
        System.out.println("Amount of money available: "+ adopter1.getAmountOfMoneyAvailable());
        System.out.println();

        Adopter adopter2 = new Adopter("Andrei");
        adopter2.setAmountOfMoneyAvailable(500);
        System.out.println("Adaptor name: " + adopter2.getName());
        System.out.println("Amount of money available: "+ adopter2.getAmountOfMoneyAvailable());
        System.out.println();

        Adopter adopter3 = new Adopter("Tudor");
        adopter3.setAmountOfMoneyAvailable(125.30);
        System.out.println("Adaptor name: " + adopter3.getName());
        System.out.println("Amount of money available: "+ adopter3.getAmountOfMoneyAvailable());
        System.out.println();

        Adopter adopter4 = new Adopter("Ionut");
        adopter4.setAmountOfMoneyAvailable(200.60);
        System.out.println("Adaptor name: " + adopter4.getName());
        System.out.println("Amount of money available: "+ adopter4.getAmountOfMoneyAvailable());
        System.out.println();



        Dog dog1 = new Dog("Bindi",false);
        dog1.setDogBreed("Beagle");
        dog1.setNeedsAWalk(new Random().nextBoolean());
        dog1.setAge(2);
        dog1.setHealthLevel(new Random().nextInt(10));
        dog1.setHungerLevel(new Random().nextInt(10));
        dog1.setMoodLevel(new Random().nextInt(10));
        dog1.setFavoriteFood("Rio");
        dog1.setRecreationalActivity("Flight");
        System.out.println("Dog name: " + dog1.getName());
        System.out.println("Dog breed: " + dog1.getDogBreed());
        System.out.println("Does the dog need a walk? " + dog1.isNeedsAWalk());
        System.out.println("Does the dog have a owner? " + dog1.isHasAnOwner());
        System.out.println("Age: " + dog1.getAge() + " years.");
        System.out.println("Level of healt: " + dog1.getHealthLevel());
        System.out.println("The level of feeling hungry: "  + dog1.getHungerLevel());
        System.out.println("Mood level: " + dog1.getMoodLevel());
        System.out.println("The name of favorite food: " + dog1.getFavoriteFood());
        System.out.println("The name of the preferred recreational activity: " + dog1.getRecreationalActivity());
        System.out.println();

        Dog dog2 = new Dog("Bruno",false);
        dog2.setDogBreed("Akita Japonez");
        dog2.setNeedsAWalk(new Random().nextBoolean());
        dog2.setAge(5);
        dog2.setHealthLevel(new Random().nextInt(10));
        dog2.setHungerLevel(new Random().nextInt(10));
        dog2.setMoodLevel(new Random().nextInt(10));
        dog2.setFavoriteFood("Briatos");
        dog2.setRecreationalActivity("Running");
        System.out.println("Dog name: " + dog2.getName());
        System.out.println("Dog breed: " + dog2.getDogBreed());
        System.out.println("Does the dog need a walk? " + dog2.isNeedsAWalk());
        System.out.println("Does the dog have a owner? " + dog2.isHasAnOwner());
        System.out.println("Age: " + dog2.getAge() + " years.");
        System.out.println("Level of healt: " + dog2.getHealthLevel());
        System.out.println("The level of feeling hungry: "  + dog2.getHungerLevel());
        System.out.println("Mood level: " + dog2.getMoodLevel());
        System.out.println("The name of favorite food: " + dog2.getFavoriteFood());
        System.out.println("The name of the preferred recreational activity: " + dog2.getRecreationalActivity());
        System.out.println();

        Dog dog3 = new Dog("Elmo",false);
        dog3.setDogBreed("Basenji");
        dog3.setNeedsAWalk(new Random().nextBoolean());
        dog3.setAge(1);
        dog3.setHealthLevel(new Random().nextInt(10));
        dog3.setHungerLevel(new Random().nextInt(10));
        dog3.setMoodLevel(new Random().nextInt(10));
        dog3.setFavoriteFood("Milk");
        dog3.setRecreationalActivity("Sleep");
        System.out.println("Dog name: " + dog3.getName());
        System.out.println("Dog breed: " + dog3.getDogBreed());
        System.out.println("Does the dog need a walk? " + dog3.isNeedsAWalk());
        System.out.println("Does the dog have a owner? " + dog3.isHasAnOwner());
        System.out.println("Age: " + dog3.getAge() + " years.");
        System.out.println("Level of healt: " + dog3.getHealthLevel());
        System.out.println("The level of feeling hungry: "  + dog3.getHungerLevel());
        System.out.println("Mood level: " + dog3.getMoodLevel());
        System.out.println("The name of favorite food: " + dog3.getFavoriteFood());
        System.out.println("The name of the preferred recreational activity: " + dog3.getRecreationalActivity());
        System.out.println();

        Dog dog4 = new Dog("Haiduc",false);
        dog4.setDogBreed("Whippet");
        dog4.setNeedsAWalk(new Random().nextBoolean());
        dog4.setAge(3);
        dog4.setHealthLevel(new Random().nextInt(10));
        dog4.setHungerLevel(new Random().nextInt(10));
        dog4.setMoodLevel(new Random().nextInt(10));
        dog4.setFavoriteFood("Purina ONE");
        dog4.setRecreationalActivity("Walk in the park");
        System.out.println("Dog name: " + dog4.getName());
        System.out.println("Dog breed: " + dog4.getDogBreed());
        System.out.println("Does the dog need a walk? " + dog4.isNeedsAWalk());
        System.out.println("Does the dog have a owner? " + dog4.isHasAnOwner());
        System.out.println("Age: " + dog4.getAge() + " years.");
        System.out.println("Level of healt: " + dog4.getHealthLevel());
        System.out.println("The level of feeling hungry: "  + dog4.getHungerLevel());
        System.out.println("Mood level: " + dog4.getMoodLevel());
        System.out.println("The name of favorite food: " + dog4.getFavoriteFood());
        System.out.println("The name of the preferred recreational activity: " + dog4.getRecreationalActivity());
        System.out.println();



        Cat cat1 = new Cat("Kenzo",false);
        cat1.setEyeColor("Green");
        cat1.setAge(2);
        cat1.setHealthLevel(new Random().nextInt(10));
        cat1.setHungerLevel(new Random().nextInt(10));
        cat1.setMoodLevel(new Random().nextInt(10));
        cat1.setFavoriteFood("Rio");
        cat1.setRecreationalActivity("Flight");
        System.out.println("Cat name: " + cat1.getName());
        System.out.println("Eye color: " + cat1.getEyeColor());
        System.out.println("Does the dog have a owner? " + cat1.isHasAnOwner());
        System.out.println("Age: " + cat1.getAge() + " years.");
        System.out.println("Level of healt: " + cat1.getHealthLevel());
        System.out.println("The level of feeling hungry: "  + dog1.getHungerLevel());
        System.out.println("Mood level: " + cat1.getMoodLevel());
        System.out.println("The name of favorite food: " + cat1.getFavoriteFood());
        System.out.println("The name of the preferred recreational activity: " + cat1.getRecreationalActivity());
        System.out.println();

        Cat cat2 = new Cat("Moti",false);
        cat2.setEyeColor("Green");
        cat2.setAge(2);
        cat2.setHealthLevel(new Random().nextInt(10));
        cat2.setHungerLevel(new Random().nextInt(10));
        cat2.setMoodLevel(new Random().nextInt(10));
        cat2.setFavoriteFood("Rio");
        cat2.setRecreationalActivity("Flight");
        System.out.println("Cat name: " + cat2.getName());
        System.out.println("Eye color: " + cat2.getEyeColor());
        System.out.println("Does the dog have a owner? " + cat2.isHasAnOwner());
        System.out.println("Age: " + cat2.getAge() + " years.");
        System.out.println("Level of healt: " + cat2.getHealthLevel());
        System.out.println("The level of feeling hungry: "  + cat2.getHungerLevel());
        System.out.println("Mood level: " + cat2.getMoodLevel());
        System.out.println("The name of favorite food: " + cat2.getFavoriteFood());
        System.out.println("The name of the preferred recreational activity: " + cat2.getRecreationalActivity());
        System.out.println();



        Cat cat3 = new Cat("Moti",false);
        cat3.setEyeColor("Green");
        cat3.setAge(2);
        cat3.setHealthLevel(new Random().nextInt(10));
        cat3.setHungerLevel(new Random().nextInt(10));
        cat3.setMoodLevel(new Random().nextInt(10));
        cat3.setFavoriteFood("Rio");
        cat3.setRecreationalActivity("Flight");
        System.out.println("Cat name: " + cat3.getName());
        System.out.println("Eye color: " + cat3.getEyeColor());
        System.out.println("Does the dog have a owner? " + cat3.isHasAnOwner());
        System.out.println("Age: " + cat3.getAge() + " years.");
        System.out.println("Level of healt: " + cat3.getHealthLevel());
        System.out.println("The level of feeling hungry: "  + cat3.getHungerLevel());
        System.out.println("Mood level: " + cat3.getMoodLevel());
        System.out.println("The name of favorite food: " + cat3.getFavoriteFood());
        System.out.println("The name of the preferred recreational activity: " + cat3.getRecreationalActivity());
        System.out.println();



        Cat cat4 = new Cat("Nala",false);
        cat4.setEyeColor("Green");
        cat4.setAge(2);
        cat4.setHealthLevel(new Random().nextInt(10));
        cat4.setHungerLevel(new Random().nextInt(10));
        cat4.setMoodLevel(new Random().nextInt(10));
        cat4.setFavoriteFood("Rio");
        cat4.setRecreationalActivity("Flight");
        System.out.println("Cat name: " + cat4.getName());
        System.out.println("Eye color: " + cat4.getEyeColor());
        System.out.println("Does the dog have a owner? " + cat4.isHasAnOwner());
        System.out.println("Age: " + cat4.getAge() + " years.");
        System.out.println("Level of healt: " + cat4.getHealthLevel());
        System.out.println("The level of feeling hungry: "  + cat4.getHungerLevel());
        System.out.println("Mood level: " + cat4.getMoodLevel());
        System.out.println("The name of favorite food: " + cat4.getFavoriteFood());
        System.out.println("The name of the preferred recreational activity: " + cat4.getRecreationalActivity());
        System.out.println();



        PetFood petFood1 = new PetFood("Purina ONE", new Random().nextBoolean());
        petFood1.setAmount(10);
        petFood1.setPrice(18.90);
        petFood1.setExpirationDate(LocalDate.now());
        System.out.println("Name for pet food:  " + petFood1.getName());
        System.out.println("Amount: " + petFood1.getAmount() + " kg.");
        System.out.println("Availability in stock: " + petFood1.isAvailabilityInStock() + " kg");
        System.out.println("Price: " + petFood1.getPrice());
        System.out.println("Expiration dade: " + petFood1.getExpirationDate());
        System.out.println();

        PetFood petFood2 = new PetFood("Royal Canin", new Random().nextBoolean());
        petFood2.setAmount(10);
        petFood2.setPrice(11.75);
        petFood2.setExpirationDate(LocalDate.now());
        System.out.println("Name for pet food:  " + petFood2.getName());
        System.out.println("Amount: " + petFood2.getAmount() + " kg.");
        System.out.println("Availability in stock: " + petFood2.isAvailabilityInStock() + " kg");
        System.out.println("Price: " + petFood2.getPrice());
        System.out.println("Expiration dade: " + petFood2.getExpirationDate());
        System.out.println();

        PetFood petFood3 = new PetFood("Purina Veterinary Diets", new Random().nextBoolean());
        petFood3.setAmount(10);
        petFood3.setPrice(28.32);
        petFood3.setExpirationDate(LocalDate.now());
        System.out.println("Name for pet food:  " + petFood3.getName());
        System.out.println("Amount: " + petFood3.getAmount() + " kg.");
        System.out.println("Availability in stock: " + petFood3.isAvailabilityInStock() + " kg");
        System.out.println("Price: " + petFood3.getPrice());
        System.out.println("Expiration dade: " + petFood3.getExpirationDate());
        System.out.println();

        PetFood petFood4 = new PetFood("Petkult Medium Adult", new Random().nextBoolean());
        petFood4.setAmount(10);
        petFood4.setPrice(18.47);
        petFood4.setExpirationDate(LocalDate.now());
        System.out.println("Name for pet food:  " + petFood4.getName());
        System.out.println("Amount: " + petFood4.getAmount() + " kg.");
        System.out.println("Availability in stock: " + petFood4.isAvailabilityInStock() + " kg");
        System.out.println("Price: " + petFood4.getPrice());
        System.out.println("Expiration dade: " + petFood4.getExpirationDate());
        System.out.println();



        RecreationActivity recreationActivity1 = new RecreationActivity("Sleep");
        System.out.println("Recreation Activity: " + recreationActivity1.getName());
        System.out.println();

        RecreationActivity recreationActivity2 = new RecreationActivity("Throws the ball");
        System.out.println("Recreation Activity: " + recreationActivity2.getName());
        System.out.println();

        RecreationActivity recreationActivity3 = new RecreationActivity("Walk in the park");
        System.out.println("Recreation Activity: " + recreationActivity3.getName());
        System.out.println();

        RecreationActivity recreationActivity4 = new RecreationActivity("Running");
        System.out.println("Recreation Activity: " + recreationActivity4.getName());
        System.out.println();



        Veterinarian veterinarian1 = new Veterinarian("Pavel");
        veterinarian1.setSpecialization("Vet");
        System.out.println("Veterinarian name: " + veterinarian1.getName());
        System.out.println("Specialization: " + veterinarian1.getSpecialization());

        adopter1.feedAnimal(dog1,petFood1);
        adopter1.playWithAnimal(dog2,recreationActivity2);

        //System.out.println(dog1.moodLevel);
        //System.out.println(dog2.moodLevel);


    }
}
