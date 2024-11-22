package String;

public class stringToCharArray {
    public static void main(String[] args) {
        String message = "Hello world";
        char[] arr = message.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
