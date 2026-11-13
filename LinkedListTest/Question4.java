class Question4{
    static class Stack{
        int[] arr;
        int top=-1;
        Stack(int size){
            arr=new int[size];
        }
        void push(int x){
            arr[++top]=x;
        }
        int pop(){
            if(top==-1){
                return -1;
            }
            return arr[top--];
        }
        boolean isEmpty(){
            return top==-1;
        }
    }
    public static int evaluate(String expression){
        String[] tokens= expression.trim().split("\\s+");
        Stack s=new Stack(tokens.length);
        for(String token:tokens){
            if(token.matches("\\d+")){
                s.push(Integer.parseInt(token));

            }
            else{
                int b=s.pop();
                int a= s.pop();
                int result;
                switch(token){
                    case "+":
                        result =a+b;
                        break;
                    case "-":
                        result = a-b;
                        break;
                    case "*":
                        result= a*b;
                        break;
                    case "/":
                        if(b==0){
                            System.out.println("not divisible");
                            return  -1;
                        }
                        result=a/b;
                        break;
                    default:
                        System.out.println("Invalid operator");
                        return -1;
                }
                s.push(result);
            }
        }
        if(s.top!=0){
            System.out.println("invlaid expression");
            return -1;
        }
        return s.pop();
    }
    public static void main(String[] args) {
        String expression = "12 3 4 * + 2 /";
        System.out.println(evaluate(expression));
    }
}