package String;

import java.util.*;

public class StringTokenizerExample {

    public static void main(String[] args) {
        String str = "Hello world how are you";
        StringTokenizer st1 = new StringTokenizer(
                str, " ");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

    }
}
