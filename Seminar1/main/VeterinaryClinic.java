package main;

import java.util.ArrayList;
import java.util.List;

import main.Personal.Doctor;
import main.Personal.Nurse;
import main.Personal.Personal;
import main.clients.Animal;
import main.clients.Cat;
import main.clients.Dog;
import main.clients.Eagle;
import main.clients.Fish;
import main.clients.Flyble;
import main.clients.Goable;
import main.clients.Pigeon;
import main.clients.Swimble;

public class VeterinaryClinic {

    public void addAnimals() {
        List<Animal> listAnimals = new ArrayList<Animal>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Eagle eagle = new Eagle();
        Pigeon pigeon = new Pigeon();

        listAnimals.add(pigeon);
        listAnimals.add(cat);
        listAnimals.add(dog);
        listAnimals.add(fish);
        listAnimals.add(eagle);
        System.out.println(listAnimals);
    }

    public void addGoable(){
        List<Goable> listGoableAnimal = new ArrayList<Goable>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Eagle eagle = new Eagle();
        Pigeon pigeon = new Pigeon();

        listGoableAnimal.add(pigeon);
        listGoableAnimal.add(eagle);
        listGoableAnimal.add(cat);
        listGoableAnimal.add(dog);
        System.out.println(listGoableAnimal);
    }

    public void addFlyble(){
        List<Flyble> listFlybleAnimal = new ArrayList<Flyble>();
        Eagle eagle = new Eagle();
        Pigeon pigeon = new Pigeon();
        
        listFlybleAnimal.add(pigeon);
        listFlybleAnimal.add(eagle);
        System.out.println(listFlybleAnimal);
    }

    public void addSwimble(){
        List<Swimble> listSwimbleAnimal = new ArrayList<Swimble>();
        Eagle eagle = new Eagle();
        Fish fish = new Fish();

        listSwimbleAnimal.add(fish);
        listSwimbleAnimal.add(eagle);
        System.out.println(listSwimbleAnimal);
    }
    public void addPersonal() {
        List<Personal> listPersonal = new ArrayList<Personal>();
        Doctor doctor = new Doctor();
        Nurse nurse = new Nurse();
        listPersonal.add(doctor);
        listPersonal.add(nurse);
        System.out.println(listPersonal);
    }
}
