package Queue;

public class MyQueue {

    int[] queue = new int[5];
    int size;
    int front;
    int index;
    int rear;

    public void insertion(int data) throws MyQueueFullException{
        if (index == getSize() -1){
            throw new MyQueueFullException();
        }else {
            queue[index] = data;
            index = index + 1;
            size = size + 1;
            rear = index - 1;
        }
    }

    public void deletion() throws MyQueueEmptyException{
        for (int i = 0; i < index - 1; i++) {
            if (front == index){
                throw new MyQueueEmptyException();
            }else {
                queue[i] = queue[i + 1];
            }
        }
        size = size - 1;
        index--;
        rear = index - 1;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return front == index;
    }

    public boolean isFull() {
        return rear == getSize() - 1;
    }

    public String show() {
        String result = "";
        for (int i = 0; i < index; i++) {
            result += queue[front + i] + " ";
        }
        return result;
    }
}