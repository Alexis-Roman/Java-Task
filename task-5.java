// Largest Number Checker

import java.util.Arrays;
import java.util.Scanner;

class NumChecker{
    public static void main(String[] args) {
        //accepts user input
        Scanner inputNum = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("*LARGEST NUMBER CHECKER*");
        System.out.print("Enter your first number: ");
        numbers[0] = inputNum.nextInt();

        System.out.print("Enter your second number: ");
        numbers[1] = inputNum.nextInt();

        System.out.print("Enter your second number: ");
        numbers[2] = inputNum.nextInt();

        System.out.println(Arrays.toString(numbers));


    }
}