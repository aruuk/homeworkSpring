package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    private Animal animal;
    private Animal animal1;

    public Person(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    @Autowired
    public Person(@Qualifier("horse") Animal animal, @Qualifier("dog") Animal animal1) {
        this.animal = animal;
        this.animal1 = animal1;
    }

    public Person() {
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

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @PostConstruct
    public void initMethod(){
        System.out.println("person init");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("person destroy");
    }

    void printFavouriteAnimalPerson(){
        animal.animalMinus();
        animal1.animalPlus();
        System.out.println(getName() + ", " + getAge() + " " + getAnimal());
    }
}
