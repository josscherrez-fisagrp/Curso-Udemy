public class StringMagic {

    public String reverseWordsInSentence(String sentence) {
        // TODO: Check if the sentence is null.
        // If the sentence is null, return "INVALID"
        if (sentence == null){
            return "INVALID";
        } 
        
        if (sentence.equals("")){
            return "";
        }
        
        StringBuilder reversedSentence = new StringBuilder();
        
        for (String word: sentence.split(" ")){
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        } 
        
        return reversedSentence.toString().trim();
        
    }
}