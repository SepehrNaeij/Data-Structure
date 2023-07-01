package AnnularQueue;

public class MyAnnularQueueFullException extends RuntimeException{

    public String getMessage() {
        return "AnnularQueue is full!!!";
    }
}
