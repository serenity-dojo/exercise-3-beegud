package com.serenitydojo;

public class Dog {

    private String name;
    private String favoriteToy;
    private int age;

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

}
