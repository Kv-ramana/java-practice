import java.util.LinkedList;

public class Queue {
    private LinkedList<Integer> q = new LinkedList<>();

    public void enqueue(int x) {
        q.addLast(x);
        System.out.println(q + " is the queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int removedElement = q.removeFirst();
            System.out.println("The dequeued element is " + removedElement);
            return removedElement;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return q.getFirst();
        }
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        System.out.println("Is queue empty? " + q.isEmpty());

        q.enqueue(5);
        q.enqueue(8);
        q.enqueue(9);

        System.out.println("The peek element is " + q.peek());

        q.dequeue();
        q.dequeue();
        q.dequeue();

        System.out.println("Is queue empty? " + q.isEmpty());
    }
}