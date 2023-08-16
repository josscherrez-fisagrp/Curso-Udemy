public class StringMagic {

    /**
     * This method finds the longest word in a given sentence.
     *
     * @param sentence The sentence to find the longest word in.
     * @return The longest word in the sentence. If sentence is empty, return an empty string.
     */
    public String findLongestWord(String sentence) {

        // TODO: Write your code here
        if(sentence == null || sentence.equals("")){
            return "";
        }
        
        String[] words = sentence.split(" ");
        
        int maxLength = 0;
        String longestWord = "";
        
        for (String word: words ){
            if(word.length()> maxLength){
                maxLength = word.length();
                longestWord = word;
            }
        } 
        
        return longestWord;
        
    }
}