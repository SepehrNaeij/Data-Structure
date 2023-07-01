package LinkedList;

public class MyLinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertion(int data) {
        Node new_node = new Node(data);
        new_node.next = null;

        if (head == null) {
            head = new_node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public String printList() {
        Node node = head;
        String result = "";

        while (node != null) {
            result += node.data + " ";
            node = node.next;
        }
        return result;
    }

    public void deletion(int data) {
        Node node = head;
        Node prev = null;
        if (node != null && node.data == data) {
            head = node.next;
        }
        while (node != null && node.data != data) {

            prev = node;
            node = node.next;
        }
        if (node != null) {
            prev.next = node.next;
        }
        if (node == null) {
            System.out.println(data + " not found");
        }
    }

    public Object search(int data) {
        Node node = head;
        int i = 0;
        boolean test = false;

        while (node != null) {
            if (data == node.data) {
                test = true;
                break;
            }else {
                node = node.next;
            }
            i++;
        }
        if (test == true) {
            return i;
        }else{
            return null;
        }
    }
}


