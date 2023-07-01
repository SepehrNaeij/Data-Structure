package Stack;

public class MyStack {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public MyStack() {
        this.top = null;
    }

    public void push(int number) {
        Node temp = new Node(number);

        temp.data = number;
        temp.next = top;
        top = temp;
    }

    public void pop() throws MyStackEmptyException {
        if (top == null) {
            throw new MyStackEmptyException();
        }
        top = (top).next;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    public int top() throws MyStackEmptyException {
        if (top == null) {
            throw new MyStackEmptyException();
        }
        return top.data;
    }
}
