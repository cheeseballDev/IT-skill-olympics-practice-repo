import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String word1 = userInput.nextLine().toLowerCase();
        String word2 = userInput.nextLine().toLowerCase();

        System.out.print(checkAnagram(word1, word2) ? "IS ANAGRAM" : "IS NOT"); 
    }
    private static boolean checkAnagram(String word1,String word2) {
        if(word1.length() != word2.length())
            return false;

        int[] counts = new int[26];

        for(Character c : word1.toCharArray()) 
            if(Character.isLetter(c)) 
                counts[c - 'a']++;
        

        for(Character c : word2.toCharArray()) 
            if(Character.isLetter(c))
                counts[c - 'a']--;

        for(int i = 0; i < counts.length; i++) 
            if(counts[i] != 0)
                return false;

        return true;
    }
}
