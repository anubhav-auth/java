package ITER.Sem2.Assignment4_7;

import java.util.Scanner;

class node {
    int reg_no;
    float mark;
    node next;
}

public class SingleLinkedList {
    static node start = null;

    public static void create() {
        Scanner sc = new Scanner(System.in);
        node p = new node();
        System.out.println("Enter reg_no");
        p.reg_no = sc.nextInt();
        System.out.println("Enter mark");
        p.mark = sc.nextInt();

        p.next = null;
        start = p;
        node q = p;

        System.out.println("Do you want to create more number of nodes(y/n)");
        char ch = sc.next().charAt(0);
        while (ch != 'n') {
            p = new node();
            System.out.println("Enter reg_no");
            p.reg_no = sc.nextInt();
            System.out.println("Enter mark");
            p.mark = sc.nextInt();
            q.next = p;
            q = p;
            System.out.println("Do you want to create more number of nodes(y/n)");
            ch = sc.next().charAt(0);
        }
    }

    public static void display() {
        node p = start;
        while (p != null) {
            System.out.print(p.reg_no + ", " + p.mark + "-->");
            p = p.next;
        }

    }

    public static void insBeg() {
        Scanner sc = new Scanner(System.in);
        node p = new node();
        System.out.println("Enter reg_no");
        p.reg_no = sc.nextInt();
        System.out.println("Enter mark");
        p.mark = sc.nextInt();
        p.next = null;

        if (start == null) {
            start = p;
        } else {
            p.next = start;
            start = p;
        }
    }

    public static void insEnd() {
        Scanner sc = new Scanner(System.in);
        node p = new node();
        System.out.println("Enter reg_no");
        p.reg_no = sc.nextInt();
        System.out.println("Enter mark");
        p.mark = sc.nextInt();
        p.next = null;

        if (start == null) {
            start = p;
        } else {
            node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = p;
        }
    }

    public static void anyPos() {
        Scanner sc = new Scanner(System.in);
        node p = new node();
        System.out.println("Enter reg_no");
        p.reg_no = sc.nextInt();
        System.out.println("Enter mark");
        p.mark = sc.nextInt();
        p.next = null;
        System.out.println("Enter psoition of the new ITER.Sem2.Assignment4_7.node");
        int pos = sc.nextInt();
        if (start == null) {
            start = p;
        } else {
            node temp = start;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            p.next = temp.next;
            temp.next = p;
        }
    }

    public static void insAny() {
        Scanner sc = new Scanner(System.in);
        node p = new node();
        System.out.println("Enter reg_no");
        p.reg_no = sc.nextInt();
        System.out.println("Enter mark");
        p.mark = sc.nextInt();
        p.next = null;
        System.out.println("Enter reg_no: teh new ITER.Sem2.Assignment4_7.node will be inserted after this ITER.Sem2.Assignment4_7.node");
        int key = sc.nextInt();
        if (start == null) {
            start = p;
        } else {
            node temp = start;
            while (temp.next != null && temp.reg_no != key) {
                temp = temp.next;
            }
            if (temp.next == null) {
                System.out.println("Item not found");
            } else {
                p.next = temp.next;
                temp.next = p;
            }
        }
    }

    public static void delBeg() {
        if (start == null) {
            System.out.println("List is empty");
        } else if (start.next == null) {
            start = null;
        } else {
            start = start.next;
        }
    }

    public static void delEnd() {
        {
            if (start == null) {
                System.out.println("List is empty");
            } else if (start.next == null) {
                start = null;
            } else {
                node temp = start;
                while (temp.next.next != null) {

                    temp = temp.next;
                }
                temp.next = null;
            }
        }
    }

    public static void delAny() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the info of ITER.Sem2.Assignment4_7.node you want to delete");
        int item = sc.nextInt();
        if (start == null) {
            System.out.println("List is empty");
        } else if (start.reg_no == item) {
            start = start.next;
        } else {
            node temp = start;
            node prev = start;
            while (temp.next != null && temp.reg_no != item) {
                prev = temp;
                temp = temp.next;
            }
            if (temp.reg_no == item) {
                prev.next = temp.next;
            } else {
                System.out.println("No such item found");
            }

        }
    }

    public static void delPos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of ITER.Sem2.Assignment4_7.node you want to delete");
        int pos = sc.nextInt();
        if (start == null) {
            System.out.println("List is empty");
        } else {
            node temp = start;
            node prev = start;
            for (int i = 0; i < pos - 1; i++) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
        }
    }

    public static void search() {
        int c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data you need to search");
        int item = sc.nextInt();
        if (start == null) {
            System.out.println("List is empty");
        } else if (start.reg_no == item) {
            System.out.println("Element found at first ITER.Sem2.Assignment4_7.node");
        } else {
            node temp = start;
            while (temp != null && temp.reg_no != item) {
                temp = temp.next;
                c++;
            }
            if (temp != null) {
                System.out.println("Element found at " + c + "th ITER.Sem2.Assignment4_7.node");
            } else {
                System.out.println("Element not found");
            }
        }
    }

    public static void reverse() {
        if (start == null) {
            System.out.println("List is empty");
        } else if (start.next == null) {
            display();
        } else {
            node prev = null;
            node curr = start;
            node nextnode = null;

            while (curr != null) {
                nextnode = curr.next; // Store the next ITER.Sem2.Assignment4_7.node
                curr.next = prev; // Reverse the pointer
                prev = curr; // Move prev to current ITER.Sem2.Assignment4_7.node
                curr = nextnode; // Move current ITER.Sem2.Assignment4_7.node to the next ITER.Sem2.Assignment4_7.node

                start = prev;
            }

        }

    }

    public static void sort() {
        if (start == null || start.next == null) {
            return;
        }
        int length = count();
        for (int i = 0; i < length - 1; i++) {
            node current = start;
            node nextNode = start.next;

            for (int j = 0; j < length - i - 1; j++) {
                if (current.mark < nextNode.mark) {
                    float temp = current.mark;
                    current.mark = nextNode.mark;
                    nextNode.mark = temp;
                }
                current = nextNode;
                nextNode = nextNode.next;
            }
        }
    }

    public static int count() {
        int count = 0;
        node temp = start;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        return count;
    }


    public static void main(String[] args) {
        while (true) {
            System.out.println("\n****MENU*****");
            System.out.println("0:Exit");
            System.out.println("1:Creation");
            System.out.println("2:Display");
            System.out.println("3:Insertion at beginning");
            System.out.println("4:Insertion at end");
            System.out.println("5:Insertion after given ITER.Sem2.Assignment4_7.node");
            System.out.println("6:Insertion at given position");
            System.out.println("7:Deletion at beginning");
            System.out.println("8:Deletion at end");
            System.out.println("9:Deletion of any item");
            System.out.println("10:Deletion of any position");
            System.out.println("11:Search the data");
            System.out.println("12:Reverse the list");
            System.out.println("13:Sort the list");
            System.out.println("14: Count the ITER.Sem2.Assignment4_7.node");


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
                    anyPos();
                    break;
                case 7:
                    delBeg();
                    break;
                case 8:
                    delEnd();
                    break;
                case 9:
                    delAny();
                    break;
                case 10:
                    delPos();
                    break;
                case 11:
                    search();
                    break;
                case 12:
                    reverse();
                    break;
                case 13:
                    sort();
                    break;
                case 14:
                    count();
                    break;

                //call remaining user defined methods that we discussed in class

                default:
                    System.out.println("Wrong choice");

            }

        }
    }
}
