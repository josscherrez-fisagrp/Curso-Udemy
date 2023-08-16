public class NumberUtils {

    /**
     * This method reverses a given integer and returns the reversed number.
     * If the number is negative, it returns -1 as the reverse of a negative number is undefined.
     * If the number is zero, it returns 0 as the reverse of 0 is 0.
     * @param number: an integer
     * @return reversed number, or -1 if number is negative, or 0 if number is zero.
     */
    public int reverseNumber(int number) {
        // TODO: Write your code here
        if (number < 0){
            return -1;
        } 
        if (number == 0){
            return 0;
        } 
        
        int reversedNumber = 0; 
        
        while (number > 0){
            int digit = number%10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number/10;
            System.out.format("digit-%d number-%d reversedNumber-%d", digit, number, reversedNumber).println();
        }
        
        return reversedNumber;
    }
}