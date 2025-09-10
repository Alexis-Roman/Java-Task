//Title: Combine the Java arithmetic operators with the simple assignment operator

class ArithmeticTask {

    public static void main (String[] args){

        int result = 1 + 2; // result is now 3
        System.out.println(result);

        result -= 1;    //changed to compound operation, result is now 2
        System.out.println(result);

        result *= 2;    //changed to compound operation, result is now 4
        System.out.println(result);

        result /= 2;    //changed to compound operations, result is now 2
        System.out.println(result);

        result += 8; //changed to compound operations, result is now 10
        result %= 7; //changed to compound operations, result is now 3
        System.out.println(result);

    }
}