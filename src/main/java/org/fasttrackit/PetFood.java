package org.fasttrackit;


import java.time.LocalDate;

public class PetFood {

    private String name;
    private double price;
    private double amount;
    private LocalDate expirationDate;
    private boolean availabilityInStock;

    public PetFood(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isAvailabilityInStock() {
        return availabilityInStock;
    }

    public void setAvailabilityInStock(boolean availabilityInStock) {
        this.availabilityInStock = availabilityInStock;
    }
}
