package main.clients;

import java.time.LocalDate;

public class Cat extends Animal {

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
    public void toGo() {
        System.out.println("Животное ходит");
    }
    public void fly() {
        System.out.println("Животное не летает");
    }

    public void swim() {
        System.out.println("Животное не плавает");
    }
}

