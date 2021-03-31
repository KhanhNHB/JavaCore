package com.khanhnhb.data_structure.queue_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// class Queue<T> {
//     LinkedList<T> queue;

//     Queue() {
//         this.queue = new LinkedList<T>();
//     }

//     public boolean isEmpty() {
//         return this.queue.isEmpty();
//     }

//     public void enqueue(T data) {
//         this.queue.addLast(data);
//     }

//     public T dequeue() {
//         return this.queue.remove(0);
//     }

//     public int size() {
//         return this.queue.size();
//     }

//     public T peek() {
//         return this.queue.get(0);
//     }
// }

public class QueuStack {

    public static void main(String[] args) {
        // Queue<String> q = new Queue<String>();

        // q.enqueue("r");
        // q.enqueue("a");
        // q.enqueue("d");
        // q.enqueue("a");
        // q.enqueue("r");

        // System.out.println("Peek item: " + q.peek());
        // System.out.println("Dequeue item: " + q.dequeue());
        Stack<String> stack = new Stack<String>();

        Queue<String> queue = new LinkedList<String>();
    }
}
