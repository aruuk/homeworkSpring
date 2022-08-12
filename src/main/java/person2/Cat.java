package person2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal2{
    @Value("${cat.name}")
    private String name;
    @Value("${cat.breed}")
    private String breed;
    @Value("${cat.age}")
    private int age;
    @Value("${cat.color}")
    private String color;
    private Person2 person2;

    public Cat(Person2 person2) {
        this.person2 = person2;
    }

    public Cat(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void plusAnimal2() {
        System.out.println("plus one cat");
    }

    @Override
    public void minusAnimal2() {
        System.out.println("minus one cat");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
