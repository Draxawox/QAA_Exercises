package optional;

import java.util.*;

public class ExtraOneFromChat {
//    1. Count duplicate characters in the string. Output can be a HashMap<String, Integer> or whatever container you like)
    public static HashMap countDuplicates(String word) {
        String letter;
        int counter = 0;
        HashMap<String, Integer> duplicates = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            letter = String.valueOf(word.charAt(i));
            for (int j = 0; j < word.length(); j++) {
                if (!duplicates.containsKey(letter)) {
                    if (letter.equals(String.valueOf(word.charAt(j)))) {
                        counter++;
                    }
                }
            }
            if (counter > 1) {
                duplicates.put(letter, counter);
            }
            counter = 0;
        }
        return duplicates;
    }

//    2. Find the 1st non-repeated character in the string
    public static char uniqueCharacter(String word) {
        int counter = 0;
        char letter = ' ';
        for (int i = 0; i < word.length(); i++) {
            letter = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == letter) {
                    counter++;
                }
            }
            if (counter == 1) {
                return letter;
            }
            counter = 0;
        }
        return letter;
    }
    //3. Reverse letters in the string
    public static String reversedString(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return String.valueOf(sb);
    }
//    4. Check if the string contains only digits
    public static boolean digitsDetector(String word) {
        for (int i = 0; i < word.length(); i++) {
            try {
                Integer.parseInt(String.valueOf(word.charAt(i)));
            } catch (IllegalArgumentException e) {
                return false;
            }
        }
        return true;
    }
//    5.Count the number of vowels and consonants in the string
    public static void vowelsAndConsonantsFinder(String word) {
        int vowels = 0;
        int consonants = 0;
        List<Character> vowelsList = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        List<Character> consonantsList = new ArrayList<>(Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z'));
        for (int i = 0; i < word.length(); i++) {
            if (vowelsList.contains(word.toLowerCase().charAt(i))) {
                vowels++;
            } else if (consonantsList.contains(word.toLowerCase().charAt(i))) {
                consonants++;
            }
        }
        System.out.println("This word contains " + vowels + " vowels and " + consonants + " consonants");
    }
//    6. Count the occurrences of the character in a string. The method has 2 params - character and word
    public static void findSpecialCharacter(char character, String word) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (character == word.charAt(i)) {
                counter++;
            }
        }
        System.out.println(character + " occurs " + counter + " times");
    }
//    7. Generate all permutations for the string



}


/*




Check if the word is a palindrome
Remove duplicate characters from the string
Remove a given character from the string
Find the characters with the most appearances
Find the longest common prefix for an array of strings

 */
