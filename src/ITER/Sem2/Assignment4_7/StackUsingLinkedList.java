package ITER.Sem2.Assignment4_7;

import java.util.Scanner;

class Node2 {
    int info;
    Node2 next;

    Node2(int info) {
        this.info = info;
        next = null;
    }
}

public class StackUsingLinkedList {

    public static Node2 push(Node2 top) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to push:");
        int element = sc.nextInt();
        Node2 newNode = new Node2(element);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        return top;
    }

    public static Node2 pop(Node2 top) {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped element: " + top.info);
            top = top.next;
        }
        return top;
    }

    public static void display(Node2 top) {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        Node2 temp = top;
        while (temp != null) {
            System.out.println(temp.info);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node2 top = null;

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Display");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
