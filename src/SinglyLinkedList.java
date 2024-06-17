import java.util.Scanner;


public class SinglyLinkedList {
    static class Node {
        int info;
        Node next;

        public Node(int info) {
            this.info = info;
            this.next = null;
        }
    }

    static Scanner sc = new Scanner(System.in);
    static Node head = null;


    static void create() {
        if (head == null) {
            System.out.println("enter");
            int data = sc.nextInt();

            Node temp = new Node(data);

            head = temp;
            Node newNode1 = temp;


            System.out.println("do you want to add more?");
            char c = sc.next().charAt(0);
            while (c != 'n') {
                System.out.println("enter");
                data = sc.nextInt();
                temp = new Node(data);

                newNode1.next = temp;
                newNode1 = temp;
                System.out.println("do you want to add more?");
                c = sc.next().charAt(0);
            }

        } else {
            System.out.println("list already created");
        }
    }

    static void insbeg(int data) {
        if (head == null) {
            System.out.println("create list first");
        } else {
            Node newNode1 = new Node(data);
            newNode1.next = head;
            head = newNode1;
        }
    }

    static void insNth(int data, int position) {
        int counter = 1;
        Node temp = head;
        while (temp != null) {
            if (counter == (position - 1)) {
                Node newNode1 = new Node(data);
                newNode1.next = temp.next;
                temp.next = newNode1;
                break;
            }
            temp = temp.next;
            counter++;
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

    static int count() {
        int counter = 0;
        Node temp = head;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        System.out.println(counter);
        return counter;
    }

    static void sort() {

        int n = count();

        for (int i = 0; i < n-1; i++){
            Node currentNode = head;
            Node nextNode = head.next;
            for (int j = 0; j < n - i - 1; j++){
                if (currentNode.info > nextNode.info){
                    int x = currentNode.info;
                    currentNode.info = nextNode.info;
                    nextNode.info = x;
                }
                currentNode = nextNode;
                nextNode = nextNode.next;
            }

        }

    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("menu");
            int a = sc.nextInt();

            switch (a) {
                case 0 -> System.exit(0);
                case 1 -> display();
                case 3 -> create();
                case 4 -> insbeg(40);
                case 5 -> insNth(77, 4);
                case 6 -> sort();
            }

        }
    }
}