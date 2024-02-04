package main.clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable {

    Double discount;
    
    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }
    
    public Cat() {
        super();
        this.discount = 10D;
    }
    
    public Double getDiscount() {
        return discount;
    }
    
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    @Override
    public void toGo() {
        System.out.println("Животное ходит");
    }

    @Override
    public void eat() {
        System.out.println("Кошка поймала мышку и ест");
    }
}
