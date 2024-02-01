package main.clients;

import java.time.LocalDate;

public class Eagle extends Animal {
    public Eagle(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Eagle(){
        super();
    }
    public void toGo() {
        System.out.println("Животное ходит");
    }
    public void fly() {
        System.out.println("Животное летает");
    }

    public void swim() {
        System.out.println("Животное плавает");
    }
}



