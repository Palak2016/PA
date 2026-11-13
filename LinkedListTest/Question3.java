class MinStack{
    static class Node{
        int data;
        int min;
        Node next;
        Node(int data, int min){
            this.data=data;
            this.min=min;
        }
    }
    Node top;
    public void push(int x){
        if(top==null){
            top= new Node(x,x);
        }
        else{
            int minimum=Math.min(x, top.min);
            Node newnode= new Node(x,minimum);
            newnode.next= top;
            top=newnode;
        }
    }
    public int pop(){
        if(top==null){
            System.out.println("stack is empty");
            return -1;
        }
        int value=top.data;
        top=top.next;
        return value;
    }
    public int top(){
        if(top==null){
            System.out.println("stack is empty");
            return -1;
        }
        return top.data;
    }
    public int getMin(){
        if(top==null){
            System.out.println("stack is empty");
            return -1;
        }
        return top.min;
    }
    public static void main(String[] args) {
        MinStack s= new MinStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.top());
        System.out.println(s.getMin());
        s.pop();
        s.pop();
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
    }
}