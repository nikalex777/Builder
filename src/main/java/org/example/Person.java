package org.example;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;


    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;

    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder();
    }

    public boolean hasAge() {
        return age > 0;
    }

    public boolean hasAddress() {
        return city != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    @Override
    public String toString() {
        return "Person - " + "Имя " + name + ", Фамилия " + surname + ", Возраст " + age + ", Город " + city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && surname.equals(person.surname) && city.equals(person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }
}
