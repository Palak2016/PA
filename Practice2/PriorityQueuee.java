class PriorityQueuee {
    private static class Request {
        String id;
        int priority;
        long order;
        Request(String id, int priority, long order) {
            this.id = id;
            this.priority = priority;
            this.order = order;
        }
    }
    private long sequence = 0;
    private java.util.PriorityQueue<Request> pq =
        new java.util.PriorityQueue<>((a, b) -> {
            if (a.priority != b.priority) {
                return Integer.compare(a.priority, b.priority);
            }
            return Long.compare(a.order, b.order);
        });
    public void request(String id, int priority) {
        pq.offer(new Request(id, priority, sequence++));
    }
    public String next() {
        if (pq.isEmpty()) {
            return "EMPTY";
        }
        return pq.poll().id;
    }
    public static void main(String[] args) {
        PriorityQueuee lab = new PriorityQueuee();
        lab.request("A12", 3);
        lab.request("B07", 1);
        lab.request("C21", 1);
        System.out.println(lab.next()); 
        lab.request("D15", 2);
        System.out.println(lab.next()); 
        System.out.println(lab.next()); 
        System.out.println(lab.next()); 
        System.out.println(lab.next()); 
    }
}
