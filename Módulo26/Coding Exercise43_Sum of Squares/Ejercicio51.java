import java.util.List;

public class FunctionalProgrammingMagic {

    public static long sumOfSquares(List<Integer> numbers) {
        
        // Check if the list is null. If so, return 0.

        if (numbers == null){
            return 0;
        }
        
        return numbers.stream().mapToLong(number -> number * number).sum();
    }

}