package java_intermediate.data_structures;

import java.util.Stack;

public class LearnStack {

    /*
    LIFO - Last in, First Out
     */

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
        myStack.push(70);
        myStack.push(80);
        myStack.push(90);
        myStack.push(100);

        int topElement = myStack.peek();
        System.out.println("TOP ELEMENT: " + topElement); // 100

        int poppedElement = myStack.pop();
        System.out.println("POPPED ELEMENT: " + poppedElement);

        topElement = myStack.peek();
        System.out.println("TOP ELEMENT: " + topElement); // 90

    }
}
