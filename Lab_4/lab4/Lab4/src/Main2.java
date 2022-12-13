public class Main2 {
    public static void main (String args[]){

        hello1();
        hello2();
        hello3();
        hello4();
        hello5();
        hello6();
        hello7();
    }
    static void hello1(){
        StringBuilder s = new StringBuilder("4 + 36 = ");
        Integer a = 4;
        Integer b = 36;
        StringBuilder sum = s.append(a + b);
        System.out.println(sum);
    }
    static void hello2(){
        StringBuilder s = new StringBuilder("4 - 36 = ");
        Integer a = 4;
        Integer b = 36;
        StringBuilder sum = s.append(a - b);
        System.out.println(sum);
    }
    static void hello3(){
        StringBuilder s = new StringBuilder("4 * 36 = ");
        Integer a = 4;
        Integer b = 36;
        StringBuilder sum = s.append(a * b);
        System.out.println(sum);
    }
    static void hello4(){
        StringBuilder s = new StringBuilder("4 + 36 = ");
        Integer a = 4;
        Integer b = 36;
        StringBuilder sum = s.append(a + b);
        s = s.delete(7,8);
        s.insert(7,"рівно");
        System.out.println(sum);
    }
    static void hello5(){
        StringBuilder s = new StringBuilder("4 + 36 = ");
        Integer a = 4;
        Integer b = 36;
        StringBuilder sum = s.append(a + b);
        s = s.replace(7,8,"рівно");
        System.out.println(sum);
    }
    static void hello6(){
        StringBuilder s = new StringBuilder("4 + 36 = ");
        Integer a = 4;
        Integer b = 36;
        StringBuilder sum = s.append(a + b);
        s = s.reverse();
        System.out.println(sum);
    }
    static void hello7(){
        StringBuilder s = new StringBuilder("4 + 36 = ");
        Integer a = 4;
        Integer b = 36;
        StringBuilder sum = s.append(a + b);
        int capacity = s.capacity();
        int lenght = s.length();
        System.out.println(sum);
        System.out.println(lenght);
        System.out.println(capacity);

    }


}
