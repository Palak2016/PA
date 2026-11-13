import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String s= "madam";
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                deque.addLast(ch);
            }
        }
        boolean palindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}