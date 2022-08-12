package person2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

        public static void main(String[] args) {

            ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("applicationContext.xml");

            Person2 person2 = context.getBean("person2", Person2.class);


            Animal2 cat = context.getBean("cat", Cat.class);
            Animal2 lion = context.getBean("lion", Lion.class);

            System.out.println(person2);
            System.out.println(cat);
            System.out.println(lion);
            cat.minusAnimal2();
            lion.plusAnimal2();
        }
    }
