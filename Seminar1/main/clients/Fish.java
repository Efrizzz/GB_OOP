package main.clients;

import java.time.LocalDate;

public class Fish extends Animal implements Swimble, Goable, Flyble {
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Fish(){
        super();
    }
    @Override
    public void toGo() {
        System.out.println("");
    }
    @Override
    public void fly() {
        System.out.println("");
    }
    @Override
    public void swim() {
        System.out.println("Животное плавает");
    }
    @Override
    public void eat() {
        System.out.println("Рыбка ест");
    }
}


