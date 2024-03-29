package main.drugstore;

import main.drugstore.components.Azitronite;
import main.drugstore.components.Penicillin;
import main.drugstore.components.Water;

import java.util.*;

public class Drugmain {

    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);


        PharmacyTwo p1 = new PharmacyTwo();
        p1.addComponents(water, azitronite);

        PharmacyTwo p2 = new PharmacyTwo();
        p2.addComponents(penicillin, water);

        PharmacyTwo p3 = new PharmacyTwo();
        p3.addComponents(azitronite, penicillin);

        List<Component> components = new ArrayList<>();

        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        System.out.println(components);

        Collections.sort(components,Comparator.reverseOrder());
        System.out.println(components);
        
        Collections.sort(components, Comparator.reverseOrder());
    System.out.println(components);

    List<Pharmacy> pharmacies = new ArrayList<>();
    pharmacies.add(new Pharmacy("Pharmacy 1", 10.5));
    pharmacies.add(new Pharmacy("Pharmacy 2", 5.2));
    pharmacies.add(new Pharmacy("Pharmacy 3", 15.7));

    Collections.sort(pharmacies);

    for (Pharmacy p : pharmacies) {
        System.out.println(p.getName() + ": " + p.getWeight());
    }


//        Iterator<Component> iterator = p1;
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

//        for (Component c : p2) {
//            System.out.println(c);
//        }

    }
}
