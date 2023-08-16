public class ArrayMagic {

    /**
     * This method checks if the input array is sorted in ascending order.
     * 
     * @param array the array to check
     * @return true if the array is sorted, false otherwise
     */
    public boolean isSorted(int[] array) {

        // TODO: Write code here
        if (array.length <= 1){
            return true;
        } 
        
        for (int i = 0; i<array.length-1 ; i++ ){
            if (array[i+1] <array[i]){
                return false;
            } 
        } 
        
        return true;
    }
}