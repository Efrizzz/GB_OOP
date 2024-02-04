package main.clients;

// import java.io.Serializable;
// import java.util.ArrayList;
// import java.util.List;

@FunctionalInterface
public interface Goable {
    void toGo();
    default double getRunSpeed(){
        return 10;
    }

}
