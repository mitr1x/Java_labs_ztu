import java.util.ArrayList;
import java.util.Collections;


public class Main {

    static class Product{
        String arr = "Volvo";
    }


    public static void main(String[] args) {
        Product myObj = new Product();
        System.out.println("OBJ");
        System.out.println(myObj.arr);


        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("CARS:");
        System.out.println(cars);

        System.out.println("cars get element 0:");
        System.out.println( cars.get(0));

        cars.set(0, "Opel");
        System.out.println("cars set:");
        System.out.println(cars);

        System.out.println("cars size");
        System.out.println( cars.size());

        System.out.println("cars contain");
        System.out.println(cars.contains("Mazda"));

        System.out.println("cars indexOf");
        System.out.println( cars.indexOf("Mazda"));

        System.out.println("cars lastIndexOf");
        System.out.println( cars.lastIndexOf("Mazda"));


        System.out.println("cars iterator");
        System.out.println(cars.iterator());

        System.out.println("cars listIterator");
        System.out.println( cars.listIterator());


        System.out.println("Cars Sorted:");
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println("cars remove 1:");
        cars.remove(1);
        System.out.println(cars);

        cars.clear();
        System.out.println("cars clear:");
        System.out.println(cars);
    }
}