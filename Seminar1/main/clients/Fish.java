package main.clients;

import java.time.LocalDate;

public class Fish extends Animal {
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Fish(){
        super();
    }
    public void toGo() {
        System.out.println("Животное не ходит");
    }
    public void fly() {
        System.out.println("Животное не летает");
    }

    public void swim() {
        System.out.println("Животное плавает");
    }
}

