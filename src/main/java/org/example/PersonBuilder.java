package org.example;

import java.io.FileNotFoundException;

public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String city;


    public PersonBuilder setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalStateException("Укажите имя");
        } else {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.isEmpty() || surname.isBlank()) {
            throw new IllegalStateException("Укажите фамилию");
        } else {
            this.surname = surname;
        }
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Не корректный возраст");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String city) {
        if (city == null || city.isEmpty() || city.isBlank()) {
            throw new IllegalStateException("Укажите город");
        } else {
            this.city = city;
        }
        return this;
    }

    public Person build() {
        return new Person(name, surname, age, city);
    }
}
