package com.palindrome;

public class Main {

    public static void main(String[] args) {
	    // examples of palindromes: mom, dad, bob, madam, race car, nurses run

        String original = "race car";
        original = original.replace(" ", "");
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reverse.charAt(i)) {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's NOT a palindrome!");
        }
    }
}
