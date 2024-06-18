package ITER.Sem2.Assignment4_7;

import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;
}

public class DoubleLinkedList {
    static Node start = null;

    public static void create() {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter reg_no");
        p.regd_no = sc.nextInt();
        System.out.println("Enter mark");
        p.mark = sc.nextInt();
        p.next = null;
        p.prev = null;
        start = p;
        Node q = p;
        System.out.println("Do you want to create more number of nodes(y/n)");
        char ch = sc.next().charAt(0);
        while (ch != 'n') {
            p = new Node();
            System.out.println("Enter reg_no");
            p.regd_no = sc.nextInt();
            System.out.println("Enter mark");
            p.mark = sc.nextInt();
            p.next = null;

            p.prev = q;
            q.next = p;
            q = p;
            System.out.println("Do you want to create more number of nodes(y/n)");
            ch = sc.next().charAt(0);
        }
    }

    public static void display() {
        Node p = start;
        while (p != null) {
            System.out.print(p.regd_no + ", " + p.mark + "-->");
            p = p.next;
        }
    }

    public static void insBeg() {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter reg_no");
        p.regd_no = sc.nextInt();
        System.out.println("Enter mark");
        p.mark = sc.nextInt();
        p.next = start;
        p.prev = null;
        if (start != null)
            start.prev = p;
        start = p;
    }

    public static void insEnd() {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter reg_no");
        p.regd_no = sc.nextInt();
        System.out.println("Enter mark");
        p.mark = sc.nextInt();
        p.next = null;

        if (start == null) {
            p.prev = null;
            start = p;
            return;
        }
        Node temp = start;
        while (temp.next != null)
            temp = temp.next;
        temp.next = p;
        p.prev = temp;
    }

    public static void insAny() {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter reg_no");
        p.regd_no = sc.nextInt();
        System.out.println("Enter mark");
        p.mark = sc.nextInt();
        p.next = null;
        p.prev = null;

        System.out.println("Enter position of new node");
        int pos = sc.nextInt();

        if (start == null) {
            start = p;
            return;
        }

        if (pos == 1) {
            p.next = start;
            start.prev = p;
            start = p;
            return;
        }

        Node temp = start;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        p.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = p;
        }
        temp.next = p;
        p.prev = temp;
    }


    public static void delBeg() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        if (start.next != null)
            start.next.prev = null;
        start = start.next;
    }

    public static void delEnd() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        if (start.next == null) {
            start = null;
            return;
        }
        Node temp = start;
        while (temp.next != null)
            temp = temp.next;
        temp.prev.next = null;
    }

    public static void delAny() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the info of node you want to delete");
        int item = sc.nextInt();
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        if (start.regd_no == item) {
            start = start.next;
            if (start != null)
                start.prev = null;
            return;
        }
        Node temp = start;
        while (temp != null && temp.regd_no != item)
            temp = temp.next;
        if (temp == null) {
            System.out.println("No such item found");
            return;
        }
        if (temp.next != null)
            temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
    }

    public static void delPos()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position of new node");
        int pos = sc.nextInt();
        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        if (pos == 0) {
            if (start.next != null) {
                start.next.prev = null;
            }
            start = start.next;
            return;
        }

        Node temp = start;
        for (int i = 0; temp != null && i < pos; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }


    public static void search()
    {
        int c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data you need to search");
        int item = sc.nextInt();
        Node temp = start;
        while (temp != null && temp.regd_no != item) {
            temp = temp.next;
            c++;
        }
        if (temp != null)
            System.out.println("Element found at " + c + "th node");
        else
            System.out.println("Element not found");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n****MENU*****");
            System.out.println("0:Exit");
            System.out.println("1:Creation");
            System.out.println("2:Display");
            System.out.println("3:Insertion at beginning");
            System.out.println("4:Insertion at end");
            System.out.println("5:Insertion at any position");
            System.out.println("6:Deletion at beginning");
            System.out.println("7:Deletion at end");
            System.out.println("8:Deletion of any item");
            System.out.println("9:Deletion of node at given position");
            System.out.println("10:Search the data");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    insBeg();
                    break;
                case 4:
                    insEnd();
                    break;
                case 5:
                    insAny();
                    break;
                case 6:
                    delBeg();
                    break;
                case 7:
                    delEnd();
                    break;
                case 8:
                    delAny();
                    break;
                case 9:
                    delPos();
                case 10:
                    search();
                    break;

                // call remaining user-defined methods that we discussed in class

                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
