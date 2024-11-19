public class PrintfExamples {
    public static void main(String[] argv) {

        // Integer Formatting
        System.out.printf("Integer: %d\n", 42); // Output: Integer: 42

        // Floating-Point Formatting
        System.out.printf("Float: %.2f\n", 3.14159); // Output: Float: 3.14

        // String and Character
        System.out.printf("String: %s, Character: %c\n", "Java", 'A'); // Output: String: Java, Character: A

        // Alignment and Padding
        System.out.printf("|%-10s|%10s|\n", "left", "right"); // Output: |left | right|

        // Hexadecimal and Octal
        System.out.printf("Hex: %x, Octal: %o\n", 255, 8); // Output: Hex: ff, Octal: 10

    }
}
