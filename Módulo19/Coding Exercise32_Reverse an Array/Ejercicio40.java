public class ArrayMagic {

    /**
     * This method reverses an array.
     * 
     * @param array the array to reverse
     * @return a new array with elements in reverse order
     */
    public int[] reverseArray(int[] array) {

        // TODO: Write your code here
        if (array.length < 1){
            return array;
        } 
        
        int start = 0;
        int end = array.length - 1;
        
        int [] reverseArray = new int[array.length];
        
        while(start <= end){
            reverseArray[start]=array[end];
            reverseArray[end] = array[start];
            start++;
            end--;
        }
        
        return reverseArray;
    }
}