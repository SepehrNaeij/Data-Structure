package Stack;

public class MyStackEmptyException extends RuntimeException {

    public String getMessage() {
        return "Stack is empty!!!";
    }
}

