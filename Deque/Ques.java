// Question 2: Design a Circular Queue with Wrap-Around

// Problem Statement:

// Implement a Circular Queue of capacity 4 using an array in Java.

// Your implementation should support the following operations:

// 1. Enqueue: Insert an element into the queue.
// 2. Dequeue: Remove an element from the front of the queue.
// 3. Display: Print all elements in the queue in their logical order.

// The circular queue must reuse the empty spaces created by dequeue operations. When the rear pointer reaches the last index of the array, it should wrap around to index `0 if space is available. Similarly, the front pointer should also wrap around to index `0 when it moves beyond the last index.

// Requirements

// - Implement the circular queue using an array of size 4.
// - Handle both overflow (queue full) and underflow (queue empty) conditions.
// - Use the modulo (%) operator to implement wrap-around.
// - Demonstrate that the queue can reuse previously occupied positions after elements are removed.
// - Verify that both the front and rear pointers work correctly during wrap-around.

// Sample Operations

// Perform the following operations in sequence:

// 1. Insert 1, 2, 3, and 4 into the queue.
// 2. Display the queue.
// 3. Remove two elements from the front.
// 4. Insert 5 and 6 into the queue.
// 5. Display the queue to verify rear wrap-around.
// 6. Remove three elements from the queue.
// 7. Insert 7, 8, and 9.
// 8. Display the queue to verify that the front and rear pointers continue to work correctly after wrap-around.

// Expected Final Output

// After performing all the operations, the final queue should contain:

// 6 7 8 9
public class Ques {
    
}
