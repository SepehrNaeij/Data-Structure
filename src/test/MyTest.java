import AnnularQueue.MyAnnularQueue;
import HanoiTower.HanoiTower;
import LinkedList.MyLinkedList;
import Queue.MyQueue;
import QueueUsingLinkedList.QueueUsingLinkedList;
import Stack.MyStack;
import org.junit.jupiter.api.Test;

import javax.xml.soap.Node;

import static org.junit.jupiter.api.Assertions.*;


public class MyTest {

    @Test
    public void MyStackTest() {

        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(3);
        myStack.push(5);
        myStack.push(7);

        assertEquals(7, myStack.top(), "Failed");

        myStack.pop();

        assertEquals(5, myStack.top(), "Failed");

        assertFalse(myStack.isEmpty(), "Failed");

        myStack.pop();
        myStack.pop();
        myStack.pop();

        assertTrue(myStack.isEmpty(), "Failed");
    }

    @Test
    public void MyQueueTest() {

        MyQueue myQueue = new MyQueue();

        myQueue.insertion(2);
        myQueue.insertion(4);
        myQueue.insertion(6);
        myQueue.insertion(8);
        myQueue.insertion(9);

        assertEquals("2 4 6 8 9 ", myQueue.show(), "Failed");

        assertTrue(myQueue.isFull());

        myQueue.deletion();

        assertEquals("4 6 8 9 ", myQueue.show(), "Failed");

        myQueue.deletion();
        myQueue.deletion();
        myQueue.deletion();
        myQueue.deletion();

        assertTrue(myQueue.isEmpty());
    }

    @Test
    public void MyAnnularQueueTest() {

        MyAnnularQueue myAnnularQueue = new MyAnnularQueue();

        assertTrue(myAnnularQueue.isEmpty());

        myAnnularQueue.insertion(3);
        myAnnularQueue.insertion(4);
        myAnnularQueue.insertion(5);
        myAnnularQueue.insertion(6);
        myAnnularQueue.insertion(7);


        assertTrue(myAnnularQueue.isFull());

        myAnnularQueue.deletion();
        myAnnularQueue.deletion();
        myAnnularQueue.deletion();
        myAnnularQueue.deletion();
        myAnnularQueue.deletion();

        assertTrue(myAnnularQueue.isEmpty());

    }

    @Test
    public void MyLinkedList() {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.insertion(8);
        myLinkedList.insertion(4);
        myLinkedList.insertion(6);
        myLinkedList.insertion(2);

        assertEquals("8 4 6 2 ", myLinkedList.printList(), "Failed");

        assertEquals(2, myLinkedList.search(6), "Failed");
        assertNull(myLinkedList.search(3), "Failed");

        myLinkedList.deletion(4);
        myLinkedList.deletion(6);

        assertEquals("8 2 ", myLinkedList.printList(), "Failed");

    }

    @Test
    public void QueueUsingLinkedList() {

        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        assertTrue(queue.isEmpty(), "Failed");

        queue.insertion(1);
        queue.insertion(4);
        queue.insertion(2);
        queue.insertion(9);
        queue.insertion(7);

        assertFalse(queue.isEmpty(), "Failed");

        queue.deletion();
        queue.deletion();
        queue.deletion();
        queue.deletion();
        queue.deletion();

        assertTrue(queue.isEmpty(), "Failed");

    }


}


