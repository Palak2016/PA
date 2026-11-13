import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
class MaxHeapImplementation {
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap();
        h.insert(50);
        h.insert(40);
        h.insert(10);
        h.insert(20);
        h.insert(30);
        h.insert(25);
        System.out.println("Max Heap:");
        h.display();
        System.out.println("Deleted Max: " + h.deleteMax());
        System.out.println("After Deletion:");
        h.display();
    }
}
class MaxHeap{
    ArrayList<Integer> heap = new ArrayList<>();
    void insert(int value) {

        heap.add(value);

        int idx = heap.size() - 1;

        heapifyUp(idx);
    }
    void heapifyUp(int idx) {
        while (idx > 0) {
            int parent = (idx - 1) / 2;
            if (heap.get(idx) > heap.get(parent)) {
                Collections.swap(heap, idx, parent);
                idx = parent;
            } 
            else {
                break;
            }
        }
    }
    int deleteMax() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }
        int max = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }
        return max;
    }
    void heapifyDown(int index) {
        int size = heap.size();
        while (true) {
            int largest = index;
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            if (left < size && heap.get(left) > heap.get(largest)) {
                largest = left;
            }
            if (right < size && heap.get(right) > heap.get(largest)) {
                largest = right;
            }
            if (largest == index) {
                break;
            }
            Collections.swap(heap, index, largest);
            index = largest;
        }
    }
    void display() {
        System.out.println(heap);
    }
}
