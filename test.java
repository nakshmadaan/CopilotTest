// Create a class named test.java and add 2 utility methods to find prime no and even no
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }


    // function to find duplicates words in a string
        public static void duplicateWords(String input) {
        // split input string by spaces
        String[] words = input.split(" ");

        // create a hashmap to store words and their count
        HashMap<String, Integer> wordCount = new HashMap<>();

        // iterate over each word
        for (String word : words) {
            // if word is already present in hashmap, increment its count
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // if word is not present in hashmap, add word with count 1
                wordCount.put(word, 1);
            }
        }

        // print duplicate words
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}


