import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(6);
        ts.add(10);
        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());

        System.out.println(ts.headSet(5));

        System.out.println(ts.subSet(1, 3));

        System.out.println(ts.tailSet(3));

        System.out.println(ts.ceiling(4));
        System.out.println(ts.floor(4));

        System.out.println(ts.higher(1));

        System.out.println(ts.lower(3));


        ts.pollFirst();
        System.out.println(ts);
        ts.pollLast();
        System.out.println(ts);
    }
}
