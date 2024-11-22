package String;

public class StringBuilderExample {
    public static void main(String[] args) {
        String message = "hello"; // string is immutable in nature thats why its thread safe , Performance=Slow

        StringBuilderExample sb = new StringBuilderExample("Hello"); // String buffer is mutable in nature ,
                                                                     // Performance=fast
        sb.append(" World");
        char arr[] = new char[3];
        sb.getChars(0, 2, arr, 1);
        System.out.println(sb.toString());

        StringBuffer message1 = new StringBuffer("hello"); // String buffer is mutable in nature, Performance=slower
                                                           // than StringBuilder
        message1.append("world");
        System.out.println(message1);

    }
}
