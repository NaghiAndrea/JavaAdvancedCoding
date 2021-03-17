//run-time exceptions == unchecked exceptions - extinde RunTimeException

public class MaximumNumberOfStudentsReached extends RuntimeException{
    public MaximumNumberOfStudentsReached(String message) {
        super(message);
    }
}
