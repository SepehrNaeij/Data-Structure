package Queue;

public class MyQueueEmptyException extends RuntimeException{

    public String getMessage() {
        return "Queue is empty!!!";
    }
}
