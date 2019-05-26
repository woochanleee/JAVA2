package collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<Integer>  A= new HashSet<Integer>();
        A.add(1);
        A.add(3);
        A.add(2);
        A.add(3);
        A.add(3);

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(4);
        B.add(5);
        B.add(6);

        HashSet<Integer> C = new HashSet<Integer>();
        C.add(7);
        C.add(8);
        C.add(9);

        Iterator hi = (Iterator) A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
}
