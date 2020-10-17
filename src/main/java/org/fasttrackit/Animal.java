package org.fasttrackit;

public class Animal {

    private String name;
    private boolean hasAnOwner;
    private int age;

    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;

    private String favoriteFood;
    private String recreationalActivity;

    public Animal(String name, boolean hasAnOwner){
        this.name = name;
        this.hasAnOwner = hasAnOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasAnOwner() {
        return hasAnOwner;
    }

    public void setHasAnOwner(boolean hasAnOwner) {
        this.hasAnOwner = hasAnOwner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getRecreationalActivity() {
        return recreationalActivity;
    }

    public void setRecreationalActivity(String recreationalActivity) {
        this.recreationalActivity = recreationalActivity;
    }
}
