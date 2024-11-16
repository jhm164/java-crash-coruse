/* 
Data Type	Size	Default Value	Range	Description	Example
byte	1 byte (8 bits)	0	
short	2 bytes (16 bits)	0	-32,768 to 32,767	Larger integer range than byte.	short s = 20000;
int	4 bytes (32 bits)	0	-2,147,483,648 to 2,147,483,647	Most commonly used integer type.	int num = 100000;
long	8 bytes (64 bits)	0L	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807	For very large integer values.	long l = 100000L;
float	4 bytes (32 bits)	0.0f	±3.4e−038 to ±3.4e+038	Single-precision floating-point number.	float f = 3.14f;
double	8 bytes (64 bits)	0.0	±1.7e−308 to ±1.7e+308	Double-precision floating-point number.	double d = 3.141592653589793;
char	2 bytes (16 bits)	\u0000 (null char)	'\u0000' to '\uffff' (0 to 65,535)	For storing single Unicode characters.	char c = 'A';
boolean	1 bit (size depends on JVM)	false	true or false	For storing true/false values.	boolean isActive = true;

 * 
 * 
 */


public class Variable {
    static byte b = 99; //2byte
    static char c = 'A';
    short aa= 9999;
    String name="Ram"; // 
    int age = 999999999;
    long contactnumber=9999999999999999L;
static float percentage=1.123456734f;
static double doublepercentage =  1.123456789123456789; // use higher prcision number
// double

    public static void main(String[] argv) {
        System.out.println("hello world"+percentage + " double= "+ doublepercentage);
    }
}