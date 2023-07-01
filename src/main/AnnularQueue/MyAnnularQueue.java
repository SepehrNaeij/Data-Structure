package AnnularQueue;

public class MyAnnularQueue {
    int size = 5;
    int front;
    int rear;
    int[] queue = new int[size];

    public MyAnnularQueue() {
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return (front == rear + 1) || (front == 0 && rear == size - 1);
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void insertion(int data) throws MyAnnularQueueFullException {
        if (isFull()) {
            throw new MyAnnularQueueFullException();
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            queue[rear] = data;
        }
    }

    public void deletion() throws MyAnnularQueueEmptyException {
        if (isEmpty()) {
            throw new MyAnnularQueueEmptyException();
        } else {
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
        }
    }

}