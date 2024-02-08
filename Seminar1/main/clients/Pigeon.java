package main.clients;

import java.time.LocalDate;

public class Pigeon extends Animal implements Flyble, Goable{
    public Pigeon(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
    }

    public Pigeon(){
        super();
    }


    @Override
    public void fly() {

    }

    @Override
    public void go() {

    }
}
