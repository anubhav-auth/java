package ITER.Sem2.Assignment4_7;

import java.util.Scanner;

class veg {
    int info;
    Node2 next;

    veg(int info) {
        this.info = info;
        next = null;
    }
}

public class QueueUsingLinkedList {
    public static Node2 insert(Node2 rear, Node2 front) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to insert:");
        int element = sc.nextInt();
        Node2 newNode = new Node2(element);
        if (rear == null) {
            rear = newNode;
            front = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        return front;
    }

    public static Node2 delete(Node2 rear, Node2 front) {
        if (front == null) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted element: " + front.info);
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
        return front;
    }

    public static void display(Node2 rear, Node2 front) {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements:");
        Node2 temp = front;
        while (temp != null) {
            System.out.println(temp.info);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node2 rear = null, front = null;

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Insert");
            System.out.println("2:Delete");
            System.out.println("3:Display");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    front = insert(rear, front);
                    if (rear == null) {
                        rear = front;
                    }
                    break;
                case 2:
                    front = delete(rear, front);
                    if (front == null) {
                        rear = null;
                    }
                    break;
                case 3:
                    display(rear, front);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
