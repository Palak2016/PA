public  class CircularQueue {
    static class CircularQueuee{
        int[] arr;
        int front,rear,size, capacity;
        CircularQueuee(int capacity){
            this.capacity=capacity;
            arr = new int[capacity];
            front=0;
            rear=-1;
            size=0;
        }
        void enqueue(int value){
            if(size==capacity){
                System.out.println("queue is full");
                return;
            }
            rear=(rear+1)%capacity;
            arr[rear]=value;
            size++;
            System.out.println("inserted "+value);
        }
        void deque(){
            if(size==0){
                System.out.println("queeu is empty");
                return;
            }
            System.out.println("removed "+arr[front]);
            front=(front+1)%capacity;
            size--;
        }
        void display(){
            if(size==0){
                System.out.println("queue is empty");
                return ;
            }
            System.out.println("queue: " );
            for (int i=0;i<size;i++){
                int idx= (front+i)%capacity;
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        CircularQueuee q=new CircularQueuee(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();
        q.deque();
        q.display();

    
    }

    }    

