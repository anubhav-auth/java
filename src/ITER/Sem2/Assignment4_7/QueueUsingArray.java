package ITER.Sem2.Assignment4_7;

import java.util.Scanner;

public class QueueUsingArray {
    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;

    public static void insert(int Q[]) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to insert:");
        int element = sc.nextInt();
        if (front == -1) {
            front = 0;
        }
        rear++;
        Q[rear] = element;
    }

    public static void delete(int Q[]) {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Deleted element: " + Q[front]);
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
    }

    public static void display(int Q[]) {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) {
            System.out.println(Q[i]);
        }
    }

    public static boolean isFull() {
        return rear == MAX - 1;
    }

    public static boolean isEmpty() {
        return front == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queue[] = new int[MAX];

        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    insert(queue);
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
