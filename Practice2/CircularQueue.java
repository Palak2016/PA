class CircularQueue {
    private int[] arr;
    private int front;
    private int size;
    private int capacity;
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        size = 0;
    }
    public String add(int x) {
        if (size == capacity) {
            return "FULL";
        }
        int rear = (front + size) % capacity;
        arr[rear] = x;
        size++;
        return "ADDED";
    }
    public String remove() {
        if (size == 0) {
            return "EMPTY";
        }
        int value = arr[front];
        front = (front + 1) % capacity;
        size--;
        return String.valueOf(value);
    }
    public void rotate(int k) {
        if (size == 0) {
            return;
        }
        k %= size;
        for (int i = 0; i < k; i++) {
            int value = arr[front];
            front = (front + 1) % capacity;

            int rear = (front + size - 1) % capacity;
            arr[rear] = value;
        }
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        System.out.println(q.add(10));    
        System.out.println(q.add(20));    
        System.out.println(q.add(30));    
        q.rotate(1);
        System.out.println(q.remove());   
        System.out.println(q.add(40));  
        System.out.println(q.add(50));  
        System.out.println(q.remove());   
    }
}