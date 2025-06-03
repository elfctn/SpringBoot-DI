package com.workintech.s17d2.model;

public class Developer {
    private int id;
    private String name;
    private double salary;
    private Experience experience;

    public Developer() {}

    public Developer(int id, String name, double salary, Experience experience) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }

    public void setSalary(double salary) { this.salary = salary; }

    public Experience getExperience() { return experience; }

    public void setExperience(Experience experience) { this.experience = experience; }
}
