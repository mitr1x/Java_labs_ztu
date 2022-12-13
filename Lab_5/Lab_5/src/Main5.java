import java.util.ArrayList;
import java.util.Collections;

public class Main5 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> bl = new ArrayList<Integer>();
        bl.add(2);
        bl.add(2);
        bl.add(2);
        bl.add(2);
        bl.add(2);

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(10);
        al.add(20);
        Collections.sort(al);
        System.out.println(al);
        int index = Collections.binarySearch(al,3);
        System.out.println(index);
        Collections.reverse(al);
        System.out.println(al);
        Collections.shuffle(al);
        System.out.println(al);


        System.out.println(Collections.max(al));
        System.out.println(Collections.min(al));

        Collections.copy(bl,al);
        System.out.println(bl);

        Collections.rotate(al,3);
        System.out.println(al);


        System.out.println( Collections.checkedCollection(al,Integer.class));


        System.out.println(Collections.frequency(al,20));

        Collections.fill(al,22);
        System.out.println(al);
    }
}
