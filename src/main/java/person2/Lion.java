package person2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal2{
    @Value("${lion.name}")
    private String name;
    @Value("${lion.age}")
    private int age;
    @Value("${lion.color}")
    private String color;
    private Person2 person2;

    public Lion(Person2 person2) {
        this.person2 = person2;
    }

    public Lion() {
    }

    public Lion(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void plusAnimal2() {
        System.out.println("plus one lion");
    }

    @Override
    public void minusAnimal2() {
        System.out.println("minus one lion");
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
