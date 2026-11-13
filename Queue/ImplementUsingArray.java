public class ImplementUsingArray {
    public static void main(String[] args) {
        Queue q= new Queue(6);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.display();
        q.dequeue();
        q.display();
        q.peek();
    }
}
 class Queue{
    int[] arr;
    int front,rear;
    int size;
    Queue(int size){
        this.size=size;
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    void enqueue(int value){
        if(rear==size-1){
            System.out.println("queue overflow");
            return ;
        }
        if(front==-1){
            front=0;

        }
        rear++;
        arr[rear]=value;
        System.out.println(value+" inserted");

    }
    void dequeue(){
        if(front==-1 || front>rear){
            System.out.println("underflow queue");
            return;
        }
        System.out.println(arr[front]+" removed");
        front++;
        
    }
    void peek(){
        if(front==-1 || front>rear){
            System.out.println(" empty queue");
            return ;
        }
        System.out.println("front element "+ arr[front]);
    }
    void display(){
        if(front==-1 || front>rear){
            System.out.println(" empty queue");
            return ;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
