import java.util.ArrayDeque;



public class Main2 {
    public static void main(String[] args) {
        ArrayDeque stack = new ArrayDeque<>();

        stack.push("first");
        stack.push("second");
        System.out.println("push:");
        System.out.println(stack);

        stack.offerLast("last");
        System.out.println( stack);
        stack.getFirst();
        System.out.println(stack.getFirst());
        stack.peekLast();
        System.out.println( stack.peekLast());

        stack.pollLast();
        System.out.println(stack);
        stack.removeLast();
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    }

}
