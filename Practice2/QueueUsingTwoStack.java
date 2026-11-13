import java.util.*;
public class QueueUsingTwoStack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    static void enqueue(int x) {
        stack1.push(x);
    }
    static void transfer() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
    static String dequeue() {
        transfer();
        if (stack2.isEmpty()) {
            return "EMPTY";
        }
        return String.valueOf(stack2.pop());
    }
    static String front() {
        transfer();
        if (stack2.isEmpty()) {
            return "EMPTY";
        }
        return String.valueOf(stack2.peek());
    }
    public static void main(String[] args) {
        enqueue(5);
        enqueue(12);
        System.out.println(front());
        System.out.println(dequeue());
        enqueue(19);
        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
    }
}