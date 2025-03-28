package proj3;

public class Main {
    public static void main(String[] args) {
        ChangeStack stack = new ChangeStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        stack.peekAllNodes();
        System.out.println("---------------------------------------------------------------");

        // expected output 60
        System.out.println("Top value: " + stack.peekTop());

        // expected outputs 60, 50, 40
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());

        // expected output 30
        System.out.println("Top value: " + stack.peekTop());
        System.out.println("---------------------------------------------------------------");

        stack.increaseValues(2, 5);
        // expected output 30, 25, 15
        stack.peekAllNodes();
        System.out.println("---------------------------------------------------------------");

        stack.decreaseValues(2, 5);
        // expected output 30, 20, 10
        stack.peekAllNodes();
    }
}