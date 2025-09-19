import java.util.Scanner;

// Create a program where user inputs two numbers and perform 4 basic
// arithmetic operations using 4 methods with return types and print the results
class arithmeticOps{
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Enter two numbers to perform ADDITION, SUBTRACTION, MULTIPLICATION, AND DIVISION");
        System.out.println();
        System.out.print("Enter first number: ");
        int firstNum = inputNum.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = inputNum.nextInt();

        System.out.println("Sum: " + add(firstNum, secondNum));
        System.out.println("Difference: " + subtract(firstNum, secondNum));
        System.out.println("Product: " + multiply(firstNum, secondNum));
        System.out.println("Quotient: " + divide(firstNum, secondNum));
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract (int a, int b){
        return a - b;
    }

    public static int multiply (int a, int b){
        return a * b;
    }

    public static String divide (int a, int b){
        return (b==0) ? "Undefined" : String.valueOf((double) a/b);
    }
}
