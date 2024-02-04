package main;

import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Goable> list = new ArrayList<>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        list.add(cat);
        list.add(dog);
        System.out.println(list);
        Eagle eagle = new Eagle("Орел", new Owner("Сергеев Иван"),
        LocalDate.of(2012, 1, 20), new Illness("Без проблем"));
        eagle.toGo();
        eagle.fly();
        eagle.swim();
        System.out.println();
        Fish fish = new Fish("Рыбка", new Owner("Иванов Василий"),
        LocalDate.of(2020, 5, 22), new Illness("Без проблем"));
        fish.toGo();
        fish.fly();
        fish.swim();
        
        System.out.println();

        VeterinaryClinic veterinaryClinic = new VeterinaryClinic();
        veterinaryClinic.addGoable();
        
        System.out.println();

        VeterinaryClinic veterinaryClinic2 = new VeterinaryClinic();
        veterinaryClinic2.addFlyble();

        System.out.println();

        VeterinaryClinic veterinaryClinic3 = new VeterinaryClinic();
        veterinaryClinic3.addSwimble();
        
        System.out.println();

        Fish fish2 = new Fish("Рыбка", new Owner("Иванов Василий"),
        LocalDate.of(2020, 5, 22), new Illness("Без проблем"));
        
        System.out.println(fish2);
        // Animal animal = new Animal() { // анонимный класс
        //     @Override
        //     public void eat() {
        //     }
        // };
    }
}
