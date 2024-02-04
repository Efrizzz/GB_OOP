package main.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable, Swimble {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog(){
        super();
    }
    @Override
    public void toGo() {
        System.out.println("Животное ходит");
    }
    @Override
    public void swim() {
        System.out.println("Животное плавает");
    }
    @Override
    public void eat() {
        System.out.println("Собака ест");
    }
}
