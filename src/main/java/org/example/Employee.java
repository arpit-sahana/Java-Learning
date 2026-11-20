package org.example;

public class Employee {
    private  int id;
    private String name;
    private int age;
    private int joiningYear;

    public Employee(int id, String name, int age, int joiningYear) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.joiningYear = joiningYear;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", joiningYear=" + joiningYear +
                '}';
    }
}
