package main.clients;

import java.time.LocalDate;

public class Eagle extends Animal implements Goable, Huntable, Swimble, Flyble {
    public Eagle(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Eagle() {
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
        System.out.println("Животное плавает");
    }
    @Override
    public void eat() {
        System.out.println("Орёл ест");
    }

}

