package person2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class Person2 {
    @Value("${person2.name}")
    private String name2;
    @Value("${person2.age}")
    private int age2;
    private Animal2 animal2;
    private Animal2 animal3;

    public Person2() {
    }

    @Autowired
    public Person2(@Qualifier("cat") Animal2 animal2, @Qualifier("lion") Animal2 animal3) {
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public Person2(String name2, int age2) {
        this.name2 = name2;
        this.age2 = age2;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getAge2() {
        return age2;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }

    public Animal2 getAnimal2() {
        return animal2;
    }

    public void setAnimal2(Animal2 animal2) {
        this.animal2 = animal2;
    }

    public Animal2 getAnimal3() {
        return animal3;
    }

    public void setAnimal3(Animal2 animal3) {
        this.animal3 = animal3;
    }

    Cat cat = new Cat();

    @Override
    public String toString() {
        return "Person2{" +
                "name2='" + name2 + '\'' +
                ", age2=" + age2 +
                ", favourite animals: ";
    }
}
