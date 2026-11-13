import java.util.*;

class StandardQueuee {
    private Queue<Integer> queue = new LinkedList<>();

    public void join(int x) {
        queue.offer(x);
    }

    public String serve() {
        if (queue.isEmpty()) {
            return "EMPTY";
        }
        return String.valueOf(queue.poll());
    }

    public void cancel(int x) {
        queue.remove(Integer.valueOf(x));
    }

    public static void main(String[] args) {
        StandardQueuee q = new StandardQueuee();

        q.join(41);
        q.join(17);
        q.join(29);

        q.cancel(17);

        System.out.println(q.serve());

        q.join(53);

        System.out.println(q.serve());
        System.out.println(q.serve());
        System.out.println(q.serve());
    }
}