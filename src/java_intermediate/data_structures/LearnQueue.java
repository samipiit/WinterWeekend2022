package java_intermediate.data_structures;

import java.util.LinkedList;
import java.util.Queue;

    // FIFO - First in, First Out

public class LearnQueue {

    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();

        myQueue.offer("Sami");
        myQueue.offer("Wai");
        myQueue.offer("Areeg");
        myQueue.offer("Osama");
        myQueue.offer("Luc");

        String topElement = myQueue.peek();
        System.out.println("TOP ELEMENT: " + topElement); // Sami

        String polledElement = myQueue.poll();
        System.out.println("POLLED (POPPED) ELEMENT: " + polledElement); // Sami

        topElement = myQueue.peek();
        System.out.println("TOP ELEMENT: " + topElement); // Wai

    }

}
