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
    }

    public static int add(int a, int b){
        return a + b;
    }
}
