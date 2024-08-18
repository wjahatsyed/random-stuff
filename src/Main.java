import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static String sortCharacter(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public List<String> getAnagram(String[] array1, String[] array2) {
        HashSet<String> sortedWordsInArrays2 = new HashSet<>();
        for (String word : array2) {
            sortedWordsInArrays2.add(sortCharacter(word));
        }
        HashSet<String> anagramsMatched = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();
        for (String word : array1) {
            if (sortedWordsInArrays2.contains(sortCharacter(word))) {
                if (!anagramsMatched.contains(word)) {
                    result.add(word);
                    anagramsMatched.add(word);
                }
            }
        }
        return result;
    }
}