package main.clients;

import java.time.LocalDate;

public class Eagle extends Animal implements Flyble, Goable, Swimble {
    public Eagle(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
    }

    public Eagle(){
        super();
    }


    @Override
    public void fly() {

    }

    @Override
    public void go() {

    }
    @Override
    public void swim() {

    }
}
