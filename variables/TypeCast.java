import java.util.Arrays;

public class TypeCast {

    int rollnumber = 338885554;
    long longRollnumber = rollnumber; // implicit typecasting (windeninng)

    static double doubleNum = 100.99;
    static int intNum = (int) doubleNum; // explicit typecasting (narrow down)

    static String name = "23";
    static int abc = Integer.parseInt(name);

    static String[] arr = { "a", "b" };
    static Object obj = (Object) arr;

    public static void main(String[] argv) {
        int b = abc + 4;

        System.out.println("demo=" + b);
        System.out.println("arr ="+Arrays.toString(arr));
        // if you want to print obj cast it back to string array and print 
        String[] newArr = (String[])  obj;
        System.out.println("newArr ="+Arrays.toString(newArr));

    }
}
