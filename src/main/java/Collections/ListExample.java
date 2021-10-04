package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(100);
        list.add(250);
        list.add(200);
        list.add(800);
        list.add(500);
        list.add(600);
        list.add(100);
        list.add(-900);
        Iterator<Integer> itr=list.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
