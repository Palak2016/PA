
import java.util.ArrayDeque;
import java.util.Deque;


public class StringReverse {
    public static void main(String[] args) {
        String str="hello";
        Deque<Character> dq=new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            dq.addFirst(str.charAt(i));
        }
        StringBuilder res=new StringBuilder();
        while(!dq.isEmpty()){
            res.append(dq.removeFirst());
        }
        System.out.println(res);
    }
}
