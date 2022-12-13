import com.sun.deploy.util.StringUtils;

public class Main{

    public static void main (String args[]){

        hello();
        lastchar();
        bool1();
        bool2();
        bool3();
        bool4();
        bool5();
        bool6();
        bool7();
        bool8();
    }
    static void hello(){
        String a = "I learn Java!!!";
        System.out.println(a);
    }
    static void lastchar(){
        String s = "I learn Java!!!";
        char lastchar = s.toCharArray()[s.length() - 1];
        System.out.println(lastchar);
    }
    static void bool1(){
        String s = "I learn Java !!!";
        System.out.println(s.endsWith("!!!"));
    }
    static void bool2(){
        String s = "I learn Java!!!";
        System.out.println(s.startsWith("I learn "));
    }
    static void bool3(){
        String s = "I learn Java!!!";
        System.out.println(s.contains("Java"));
    }
    static void bool4(){
        String s = "I learn Java!!!";
        s.indexOf("Java");
        System.out.println(s.indexOf("Java"));
    }
    static void bool5(){
        String s = "I learn Java!!!";
        System.out.println(s.replace("a", "o"));
    }
    static void bool6(){
        String s = "I learn Java!!!";
        System.out.println(s.toUpperCase());
    }
    static void bool7(){
        String s = "I learn Java!!!";
        System.out.println(s.toLowerCase());
    }
    static void bool8(){
        StringBuilder s = new StringBuilder("I learn Java!!!");
        s = s.delete(8,12);
        System.out.println(s);
    }

}