// Palindrome Checker

import java.util.Scanner;

class palindromeChecker{
    public static void main(String[] args) {
        //accepts user input
        Scanner input = new Scanner(System.in);
        String word;
        String reversed;
        boolean isEqual;

        System.out.println("*PALINDROME CHECKER*");
        System.out.println("Enter a word: ");
        word = input.nextLine();

        //Reversed string
        reversed = new StringBuilder(word).reverse().toString();
        System.out.println(reversed);

        //Check if input string is equal to reversed string
        isEqual = word.equals(reversed);

        System.out.println(isEqual
                ? "The input string is a palindrome."
                : "The input string is not a palindrome.");
        input.close();

    }
}