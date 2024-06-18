package ITER.Sem2.Assignment4_7;

import java.util.Scanner;

public class StackUsingArray {
    public static final int MAX = 10;

    public static int push(int S[], int top, int x) {
        if (isFull(top)) {
            System.out.println("Stack Overflow");
            return top;
        }
        top++;
        S[top] = x;
        return top;
    }

    public static int pop(int S[], int top) {
        if (isEmpty(top)) {
            System.out.println("Stack Underflow");
            return top;
        }
        System.out.println("Popped element: " + S[top]);
        top--;
        return top;
    }

    public static void display(int S[], int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(S[i]);
        }
    }

    public static boolean isEmpty(int top) {
        return top == -1;
    }

    public static boolean isFull(int top) {
        return top == MAX - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stack[] = new int[MAX];
        int top = -1;

        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    if (isFull(top)) {
                        System.out.println("Stack is full. Cannot push.");
                        break;
                    }
                    System.out.println("Enter element to push:");
                    int element = sc.nextInt();
                    top = push(stack, top, element);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
