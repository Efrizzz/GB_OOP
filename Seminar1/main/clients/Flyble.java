package main.clients;

public interface Flyble {
    void fly();
    default double getFlySpeed(){
        return 10;
    }
}
