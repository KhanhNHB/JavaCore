package com.khanhnhb.data_structure.linked_list;

import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListPractice {

    public static Node insert(Node head, int data) {
        // Complete this method
        Node current = head;
        Node node = new Node(data);

        if (current == null) {
            node.next = current;
            return node;
        }

        while (current.next != null) {
            current = current.next;
        }

        current.next = node;
        node.next = null;

        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}