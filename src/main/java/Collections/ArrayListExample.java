package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("Salam");
        name.add("Aziz");
        name.add("Kamal");
        System.out.println(name);
        for (String s : name) {
            System.out.println(s);
        }
    }
}
