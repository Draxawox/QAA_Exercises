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
        for (int i = 0; i < word.length(); i++) {
            if (vowelsList.contains(word.toLowerCase().charAt(i))) {
                vowels++;
            } else {
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

    public static void findPermutations(String word) {
        if (word.equals("")) {
            System.out.println("write smth!");
        } else {
            System.out.println("Permutataions for: " + word);
        }
        showPermutations("", word);
    }

    public static void showPermutations(String word, String lettersLeft) {
        if (lettersLeft.length() == 0) {
            System.out.println(word);
        }
        for (int i = 0; i < lettersLeft.length(); i++) {
            showPermutations(word + lettersLeft.charAt(i), lettersLeft.substring(0, i) + lettersLeft.substring(i + 1));
        }
    }

    //8. Check if the word is a palindrome

    public static void palindromeChecker(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        if (word.equals(String.valueOf(reversed))) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }

    //    9. Remove duplicate characters from the string

    public static String removeDuplicatedLetters(String word) {
        StringBuilder sb = new StringBuilder(word);
        int counter = 0;
        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    counter++;
                    if (counter > 1) {
                        sb.deleteCharAt(j);
                    }
                }
            }
            counter = 0;
        }
        return String.valueOf(sb);
    }

    //10. Remove a given character from the string

    public static String removeCharacter(char character, String word) {
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                sb = sb.deleteCharAt(i);
            }
        }
        return String.valueOf(sb);
    }

    // 11. Find the characters with the most appearances

    public static void findMostCommonCharacter(String word) {
        char common = ' ';
        int counter = 0;
        int tempCounter = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    tempCounter++;
                    if (tempCounter > counter) {
                        counter = tempCounter;
                        common = word.charAt(i);
                    }
                }
            }
            tempCounter = 0;
        }
        System.out.println(common + " appears " + counter + " times!");
    }

//    12. Find the longest common prefix for an array of strings

    public static void findLongestCommonPrefix(String[] words) {
        String prefix = "";
        int counter = 0;
        String currentPrefix;
        if (words.length > 0) {
            int shortestLen = words[0].length();
            for (String s : words) {
                if (shortestLen > s.length()) {
                    shortestLen = s.length();
                }
            }
            for (int i = 0; i < shortestLen; i++) {
                currentPrefix = String.valueOf(words[0].charAt(i));
                for (String word : words) {
                    if (String.valueOf(word.charAt(i)).equals(currentPrefix)) {
                        counter++;
                    }
                    if (counter == words.length) {
                        prefix = prefix + currentPrefix;
                    }
                }
                counter = 0;
            }
        }
        if (prefix.length() > 0) {
            System.out.println("Longest common prefix is: " + prefix);
        } else {
            System.out.println("There is no common prefix.");
        }
    }


}
/*



 */
