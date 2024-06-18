//package ITER.Sem2.Assignment4_7;
//
//import java.util.Scanner;
//
//class Node {
//    int info;
//    Node next;
//
//    Node(int info) {
//        this.info = info;
//        next = null;
//    }
//}
//
//public class StackUsingLinkedList {
//
//    public static Node push(Node top) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter element to push:");
//        int element = sc.nextInt();
//        Node newNode = new Node(element);
//        if (top == null) {
//            top = newNode;
//        } else {
//            newNode.next = top;
//            top = newNode;
//        }
//        return top;
//    }
//
//    public static Node pop(Node top) {
//        if (top == null) {
//            System.out.println("Stack Underflow");
//        } else {
//            System.out.println("Popped element: " + top.info);
//            top = top.next;
//        }
//        return top;
//    }
//
//    public static void display(Node top) {
//        if (top == null) {
//            System.out.println("Stack is empty");
//            return;
//        }
//        System.out.println("Stack elements:");
//        Node temp = top;
//        while (temp != null) {
//            System.out.println(temp.info);
//            temp = temp.next;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Node top = null;
//
//        while (true) {
//            System.out.println("****MENU****");
//            System.out.println("0:Exit");
//            System.out.println("1:Push");
//            System.out.println("2:Pop");
//            System.out.println("3:Display");
//            System.out.println("Enter your choice");
//
//            int choice = sc.nextInt();
//            switch (choice) {
//                case 0:
//                    System.exit(0);
//                case 1:
//                    top = push(top);
//                    break;
//                case 2:
//                    top = pop(top);
//                    break;
//                case 3:
//                    display(top);
//                    break;
//                default:
//                    System.out.println("Wrong choice");
//            }
//        }
//    }
//}
