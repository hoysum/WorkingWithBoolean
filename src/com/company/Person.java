package com.company;

public class Person {

    private String name;
    private Boolean frenchFries;
    private Boolean sleeping;
    private Boolean adventurous;

    public Person() {
    }

    public Person(String name, Boolean frenchFries, Boolean sleeping, Boolean adventurous) {
        this.name = name;
        this.frenchFries = frenchFries;
        this.sleeping = sleeping;
        this.adventurous = adventurous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFrenchFries() {
        return frenchFries;
    }

    public void setFrenchFries(Boolean frenchFries) {
        this.frenchFries = frenchFries;
    }

    public Boolean getSleeping() {
        return sleeping;
    }

    public void setSleeping(Boolean sleeping) {
        this.sleeping = sleeping;
    }

    public Boolean getAdventurous() {
        return adventurous;
    }

    public void setAdventurous(Boolean adventurous) {
        this.adventurous = adventurous;
    }
}
