package main.clients;

import java.time.LocalDate;

public class Fish extends Animal implements Swimble {
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
    }

    public Fish(){
        super();
    }

    @Override
    public void swim() {

    }
}
