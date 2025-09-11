// Largest Number Checker

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class NumChecker{
    public static void main(String[] args) {
        //accepts user input
        Scanner inputNum = new Scanner(System.in);
        int[] numbers = new int[3];

        try {
            System.out.println("*LARGEST NUMBER CHECKER*");
            System.out.print("Enter your first number: ");
            numbers[0] = inputNum.nextInt();

            System.out.print("Enter your second number: ");
            numbers[1] = inputNum.nextInt();

            System.out.print("Enter your second number: ");
            numbers[2] = inputNum.nextInt();

            //sorts the array
            Arrays.sort(numbers);
            System.out.println(numbers[0] == numbers[2]
                    ? "All numbers are equal"
                    : "The numbers " + Arrays.toString(numbers) + " are not equal");
        }catch (InputMismatchException e){
            System.out.println("Invalid input! Please enter a valid number.");
        }

    }
}