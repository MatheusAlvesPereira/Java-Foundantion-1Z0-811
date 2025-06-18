import java.io.PrintStream;

public class PreIncrement {
    // pre-increment ++i Will increment our value of i by 1 and then use it in our statement.
    public PrintStream preIncrementShow(){
        int integerNumber = 10;
        int preincrementNumber = ++integerNumber;

        return System.out.printf(String.valueOf(preincrementNumber));
    }
}
