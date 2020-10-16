package org.fasttrackit;


import java.time.LocalDate;

public class PetFood {

    String name;
    double price;
    double amount;
    LocalDate expirationDate;
    boolean availabilityInStock;

    public PetFood(String name, boolean availabilityInStock){
        this.name = name;
        this.availabilityInStock = availabilityInStock;
    }

}
