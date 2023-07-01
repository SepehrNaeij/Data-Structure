package Queue;

public class MyQueueFullException extends RuntimeException{

    public String getMessage() {
        return "Queue is full!!!";
    }
}
