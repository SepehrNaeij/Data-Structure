package AnnularQueue;

public class MyAnnularQueueEmptyException extends RuntimeException{

    public String getMessage() {
        return "AnnularQueue is empty!!!";
    }
}
