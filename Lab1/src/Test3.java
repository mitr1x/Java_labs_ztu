public class Test3 {
    public static void main(String[] args) {
        String a = args[args.length - 1];
        for (String arg : args){
            if (arg == a){
                System.out.print(arg);
            }
            else {
                System.out.print(arg + " ");
            }



        }
    }

}
