//VarArgs Cumulative sum

class cumulativeSum{
    public static void main(String[] args) {
        int result = cumulativeSum(4, 5, 10);
        System.out.println("Total cumulative sum of all numbers = " + result);
    }
    public static int cumulativeSum(int... numbers){
        int totalSum = 0;

        for (int n: numbers){
            int sum = 0;
            for (int i = 1; i <= n; i++){
                sum += i;
            }
            System.out.println("Cumulative sum for " + n + " is = " + sum);
            totalSum+=sum;
        }
        return totalSum;
    }
}