package main.Personal;

public class Doctor extends Personal implements Examination {
    public Doctor(String name, int age) {
        super(name, age);
    }
    public Doctor() {
        super("", 0);
    }   
    @Override
    public void work() {
        System.out.println("Доктор работает");
    }

    @Override
    public void examination() {
        System.out.println("Доктор проводит осмотр");
    }

    @Override
    public void surgery() {
        System.out.println("Доктор проводит операцию");
    }

    @Override
    public void lunchBreak() {
        System.out.println("У доктора перерыв на обед");
    }

    @Override
    public void dayOff() {
        System.out.println("Доктор берет выходной");
    }

    @Override
    public void notAvailable() {
        System.out.println("Доктора нет на месте");
    }
}

