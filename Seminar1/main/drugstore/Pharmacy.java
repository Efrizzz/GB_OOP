package main.drugstore;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

public class Pharmacy implements Comparable<Pharmacy> {
    private String name;
    private double weight;

    public Pharmacy(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Pharmacy o) {
        return Double.compare(weight, o.weight);
    }

}

// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;

// public class Pharmacy implements Iterator<Component> {
//     private List<Component> components = new ArrayList<>();
//     private int index = 0;

//     public void addComponents(Component ... components) {
//         for(Component c : components){
//             this.components.add(c);
//         }
//     }

//     @Override
//     public boolean hasNext() {
//         return index < components.size();
//     }

//     @Override
//     public Component next() {
//         return components.get(index++);
//     }
// }
