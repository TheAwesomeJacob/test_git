package Persons;

import java.util.Objects;

public class Person {
    private String name;
    private String surName;
    private String PESEL;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public Person(String name, String surName, String PESEL) {
        this.name = name;
        this.surName = surName;
        this.PESEL = PESEL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                surName.equals(person.surName) &&
                PESEL.equals(person.PESEL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, PESEL);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }
}
