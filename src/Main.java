public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        PreIncrement preincrement = new PreIncrement();
        preincrement.preIncrementShow();

        PostIncrement postIncrement = new PostIncrement();
        postIncrement.postIncrement();

        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        primitiveTypes.primitiveTypes();
    }
}