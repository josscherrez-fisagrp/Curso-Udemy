public class NumberUtils {

    public int getSumOfDigits(int number) {
        // Write your code here
        if (number < 0){
            return -1;
        } 
        
        if (number == 0){
            return 0;
        } 
        
        int sumOfDigits = 0;
        
        while (number > 0){
            int digit = number % 10;
            sumOfDigits += digit;
            number = number/10;
        }
        return sumOfDigits;
    }
}