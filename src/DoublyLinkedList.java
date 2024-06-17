import java.util.Scanner;

public class DoublyLinkedList {
    static class Node{
        Node prev;
        Node next;
        int info;

        public Node(int info) {
            this.prev = null;
            this.next = null;
            this.info = info;
        }
    }
    static Node head = null;
    static Scanner sc = new Scanner(System.in);
    static void create(){
        if (head == null) {
            System.out.println("enter: ");
            int data = sc.nextInt();
            Node temp = new Node(data);
            head = temp;
            Node newNode = temp;

            System.out.println("do you want to add more ?");
            char c = sc.next().charAt(0);

            while (c != 'n'){
                System.out.println("enter: ");
                data = sc.nextInt();
                temp = new Node(data);
                temp.prev = newNode;
                newNode.next = temp;
                newNode = temp;

                System.out.println("do you want to add more ?");
                c = sc.next().charAt(0);
            }
        }
    }

    static void insbeg(int data) {
        if (head == null) {
            System.out.println("create list first");
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.info + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        create();
        display();
        insbeg(666);
        display();
    }
}
