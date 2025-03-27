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

        // expected output 60
        System.out.println("Top value: " + stack.peekTop());

        // expected outputs 60, 50, 40
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());

        // expected output 30
        System.out.println("Top value: " + stack.peekTop());

        stack.decreaseValues(1, 3);
        // expected output 27
        System.out.println("Top value: " + stack.peekTop());

        stack.increaseValues(2, 5);
        // expected output 32
        System.out.println("Top value: " + stack.peekTop());
    }
}