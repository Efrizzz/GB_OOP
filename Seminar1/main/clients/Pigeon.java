package main.clients;

import java.time.LocalDate;

public class Pigeon extends Animal implements Goable, Huntable, Swimble, Flyble {
    public Pigeon(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Pigeon() {
        super();
    }
    @Override
    public void toGo() {
        System.out.println("Животное ходит");
    }
    @Override
    public void fly() {
        System.out.println("Животное летает");
    }

    @Override
    public void swim() {
        System.out.println("Животное не плавает");
    }
    @Override
    public void eat() {
        System.out.println("Голубь ест");
    }

}


