
import java.util.ArrayDeque;
import java.util.Deque;

public class StringPalindrome {
    public static void main(String[] args) {
        String str="madam";
        Deque<Character> dq=new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            dq.addFirst(str.charAt(i));
        }
        StringBuilder res=new StringBuilder();
        while(!dq.isEmpty()){
            res.append(dq.removeFirst());
        }
        if(str.equals(res.toString())){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
