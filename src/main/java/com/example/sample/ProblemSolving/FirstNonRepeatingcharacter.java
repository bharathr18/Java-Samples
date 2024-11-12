package com.example.sample.ProblemSolving;

public class FirstNonRepeatingcharacter {
    public static void main(String[] args) {
        String str = "bharath";
        System.out.println(nonRepeat(str));
    }

    public static char nonRepeat(String str) {
        char[] arr = new char[str.length()];

        // Populate the array with characters from the string
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        // Find the first non-repeating character
        for (int j = 0; j < arr.length; j++) {
            boolean isRepeating = false;

            // Check if the current character repeats
            for (int k = 0; k < arr.length; k++) {
                if (arr[j] == arr[k] && j != k) {
                    isRepeating = true;
                    break;
                }
            }

            // If character is not repeating, return it
            if (!isRepeating) {
                return arr[j];
            }
        }

        // If all characters are repeating, return '-'
        return '-';
    }
}
