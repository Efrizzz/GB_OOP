package main.Personal;

public class Nurse extends Personal implements Examination {
    public Nurse(String name, int age) {
        super(name, age);
    }
    public Nurse() {
        super("", 0);
    }
    
    @Override
    public void work() {
        System.out.println("Медсестра работает");
    }

    @Override
    public void examination() {
        System.out.println("Медсестра помогает при осмотре");
    }

    @Override
    public void surgery() {
        System.out.println("Медсестра готовится к операции");
    }

    @Override
    public void lunchBreak() {
        System.out.println("Медсестра на обеде");
    }

    @Override
    public void dayOff() {
        System.out.println("Медсестра берёт выходной");
    }

    @Override
    public void notAvailable() {
        System.out.println("Медсестры нет на месте");
    }
}

