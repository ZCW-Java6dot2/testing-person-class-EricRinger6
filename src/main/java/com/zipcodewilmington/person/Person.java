package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name = "";
    private int age = Integer.MAX_VALUE;
    private Boolean ownsCar;
    private Boolean ownsHouse;
    private Integer numOfFamily;
    private String nameOfDog;
    private Boolean isMarried;

    public Person() {

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setMarried(Boolean married) {
        isMarried = married;
    }

    public Boolean getMarried() {
        return isMarried;
    }

    public Boolean getOwnsCar() {
        return ownsCar;
    }

    public void setOwnsCar(Boolean ownsCar) {
        this.ownsCar = ownsCar;
    }

    public Boolean getOwnsHouse() {
        return ownsHouse;
    }

    public void setOwnsHouse(Boolean ownsHouse) {
        this.ownsHouse = ownsHouse;
    }

    public Integer getNumOfFamily() {
        return numOfFamily;
    }

    public void setNumOfFamily(Integer numOfFamily) {
        this.numOfFamily = numOfFamily;
    }

    public String getNameOfDog() {
        return nameOfDog;
    }

    public void setNameOfDog(String nameOfDog) {
        this.nameOfDog = nameOfDog;
    }

}
