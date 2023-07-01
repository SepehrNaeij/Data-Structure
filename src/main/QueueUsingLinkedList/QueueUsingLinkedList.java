package QueueUsingLinkedList;

public class QueueUsingLinkedList {
    private Node front;
    private Node rear;
    private int size;

    private static class Node {
        int data;
        Node next;
    }

    public QueueUsingLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void deletion() {
        int data = front.data;
        front = front.next;
        if (isEmpty()) {
            rear = null;
        }
        size--;
    }

    public void insertion(int data) {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        size++;
    }
}
