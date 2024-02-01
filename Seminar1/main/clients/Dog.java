package main.clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog(){
        super();
    }
    public void toGo() {
        System.out.println("Животное ходит");
    }
    public void fly() {
        System.out.println("Животное не летает");
    }

    public void swim() {
        System.out.println("Животное плавает");
    }
}
