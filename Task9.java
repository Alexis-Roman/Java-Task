import static java.lang.Math.*;
import java.util.Scanner;

public class Task9{
    public static int add(int a, int b) {
        return addExact(a, b);
    }
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }
    public static float divide(int a, int b) {
        return floorDiv(a, b);
    }
    public static void main(String[] args) {
        System.out.println("PERFORMING BASIC MATH OPERATIONS USING STATIC IMPORTS");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();

        System.out.println();
        System.out.println("Sum = " + add(firstNum, secondNum));
        System.out.println("Difference = " + subtract(firstNum, secondNum));
        System.out.println("Product = " + multiply(firstNum, secondNum));
        System.out.println("Quotient = " + divide(firstNum, secondNum));
    }
}