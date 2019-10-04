package codeWars;

public class StrongNumber {

    /*********
    Definition: Strong number is the number that the sum of the factorial of its digits is equal to number itself.

    For example: 145, since
    1! + 4! + 5! = 1 + 24 + 120 = 145
    So, 145 is a Strong number.
    
    Task
    Given a number, Find if it is Strong or not.
    
    Notes
    Number passed is always Positive.
    Return the result as String
        
    *********/
    public static void main(String[] args) {
        int i = 1;

        System.out.println(isStrongNumber(i));
    }

    /**
     * Strong number is the number that the sum of the factorial of its digits is equal to number itself
     * 
     * @param num, given number
     * @return true if is a strong number, false otherwise
     */
    public static String isStrongNumber(int num) {
        // Number passed is always Positive.
        if (num <= 0) {
            return "error";
        }

        // Determine the sum of the factorial of the number digits
        int sumFactorial = determineFactorialOfTheNumber(num);

        // Validate if the given number is STRONG or not
        String statusNumber = isStrongNumber(num, sumFactorial);

        return statusNumber;
    }

    /**
     * Determine the sum of every factorial digit of the given number
     * 
     * @param num, the given number
     * @return sum of every each digit of the number
     */
    private static int determineFactorialOfTheNumber(int num) {
        String number = Integer.toString(num);
        int sumFactorial = 0;
        for (int i = 0; i < number.length(); i++) {
            // get the digit
            int digit = Integer.parseInt(number.substring(i, i + 1));

            // calculate the factorial digit a sum to the actual sumFactorial
            sumFactorial += calculateFactorialDigit(digit);
        }

        return sumFactorial;
    }

    /**
     * Validate if the given number is STRONG or not
     * 
     * @param num, the given number
     * @param sumFactorial, its number factorial
     * @return true if is a strong number, false otherwise
     */
    private static String isStrongNumber(int num, int sumFactorial) {
        if (Integer.compare(num, sumFactorial) == 0)
            return "STRONG!!!!";
        else
            return "Not Strong !!";
    }

    /**
     * Determine the sum of the factorial of the digit
     * 
     * @param digit, given the digit number
     * @return the digit factorial
     */
    private static int calculateFactorialDigit(int digit) {
        int j, factorial = 1;

        for (j = 1; j <= digit; j++) {
            factorial = factorial * j;
        }

        return factorial;
    }
    
    
    public static String isStrongNumberOtherSolution(int num) {
        int sum = 0, n = num;
        for(; n>0; n/=10)
            sum += factorial(n%10);
        
        if(sum == num)
            return "STRONG!!!!";
        else
            return "Not Strong !!";
    }
    
    private static int factorial(int number){
        int sum = 1;
        for(int i=1; i<=number; i++)  
            sum *= i;
        return sum;
    }
}
