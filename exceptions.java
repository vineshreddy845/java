public class exceptions {

    /*
     * exception means=>exception is a abnormal condition.It interperts flow a
     * program.
     * exception handling=> It is handle runtime error, so that flow of a program
     * cannot be stopped.
     * import java.Throwable; Throwable is a root. It has two subclasses.
     * Throwable(root)
     * | |
     * Exception(subclass) Error(subclass)
     * |_______IOException |___________stackoverflow error
     * |______classNOTFoundException |____________OutOfmemory error
     * |______SQLException |____________Virtual machine error
     * |______RuntimeException
     * |___________ArithmeticEXception
     * |___________IndexOutOfBoundException
     * |___________NUllPointerEXception
     * |___________NumberFormatEXception
     * 
     * Exception are two types:
     * 1:checked exceptions: The class inherit throwable class excpet
     * runtimeExceptions and errors.These are checked at compile time.
     * 2:Unchecked exceptions: The class inherit runtime exceptions. These are
     * unchecked compile time. checked at runtime.
     * Exceptions keywords:
     * try: In try block code of exception is written.
     * catch: catch block handles the exceptions.
     * finally: these block excutes whaterver. It is indepent of try and catch.
     * Throw: Throw keyword is used to throw an exception.
     */

    public void vinesh(int a, int b) {
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException is handled");
        } finally {
            System.out.println("i don't care anything, i will be excuted");
        }
    }

    public void sam() {
        int number[], i;
        number = new int[4];// allocating memory for 4 integers
        try {
            for (i = 0; i < 6; i++) {
                number[i] = i;
                System.out.println(number[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException is handled");
        } finally {
            System.out.println("i don't care anything, i will be excuted");
        }
    }

    public static void main(String args[]) {
        exceptions obj = new exceptions();
        obj.vinesh(2, 0);
        obj.sam();
    }

}
