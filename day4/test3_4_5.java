package day4;

public class test3_4_5 {
    /*

1. Question: Is the following code legal?
    try {

    } finally {

    }
    Answer: Yes, it's legal — and very useful A try statement does not have to have a catch block if it has a finally block.
    If the code in the try statement has multiple exit points and no associated catch clauses, the code in the finally block is executed no matter how the try block is exited.
    Thus it makes sense to provide a finally block whenever there is code that must always be executed.
    This include resource recovery code, such as the code to close I/O streams.

2. Question: What exception types can be caught by the following handler?
    catch (Exception e) {

    }
    What is wrong with using this type of exception handler?
    Answer: This handler catches exceptions of type Exception;
    therefore, it catches any exception.
    This can be a poor implementation because you are losing valuable information about the type of exception being thrown and making your code less efficient.
    As a result, your program may be forced to determine the type of exception before it can decide on the best recovery strategy.

Question: Is there anything wrong with this exception handler as written? Will this code compile?
    try {

    } catch (Exception e) {

    } catch (ArithmeticException a) {

    }
    Answer: This first handler catches exceptions of type Exception;
    therefore, it catches any exception, including ArithmeticException. The second handler could never be reached. This code will not compile.
         */
}
