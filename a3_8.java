import java.util.*;

class Stack {
    int msize;
    int[] a;
    int top;

    Stack(int size) {
        msize = size;
        a = new int[msize];
        top = -1;
    }

    void push(int element) {
        if (top == msize - 1) {
            System.out.println("Stack overflow " + element);
        } else {
            a[++top] = element;
            System.out.println("Pushed element: " + element);
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int x = a[top--];
            System.out.println("Popped element: " + x);
            return x;
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(a[i]);
            }
        }
    }
}

public class a3_8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the stack");
        int size = sc.nextInt();
        Stack myStack = new Stack(size);

        int c;
        System.out.println("Enter your choice: 1 for push an element, 2 for pop an element, 3 for displaying the stack, 4 for exiting from the stack");

        c = sc.nextInt();

        switch (c) {
            case 1: {
                System.out.println("Enter an element you want to push");
                int y = sc.nextInt();
                myStack.push(y);
                break;
            }
            case 2: {
                myStack.pop();
                break;
            }
            case 3: {
                myStack.display();
                break;
            }
            case 4:
                System.out.println("Exited from stack");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
