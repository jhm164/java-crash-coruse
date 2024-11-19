import java.util.Scanner;

public class ReadArg {

    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Integer");
        int integer = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter String");
        String str = scan.nextLine();
        System.out.printf("Integer=%d , String=%s", integer, str);
        scan.close();

    }
}