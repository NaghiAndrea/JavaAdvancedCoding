//compile-time exceptions == checked exceptions - extinde Exception
//ar trebui tratat local cu try catch , pt ca altfel tot se arunca mai sus in semnatura metodelor
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
