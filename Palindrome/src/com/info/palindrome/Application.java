package com.info.palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by matthieu.bailly on 04/04/2018.
 */
public class Application {

    public static void main(String [] args) {
        String phrase = "La malade pedala mal";
        boolean palindrome = isPalindrome(phrase);
        if(palindrome){
            System.out.println("c'est un palindrome");
        }else{
            System.out.println("Faux !!");
        }
    }

    public static boolean isPalindrome(String phrase) {
        String phraseSansEspace = phrase.replaceAll(" ", "");
        boolean isPalindrome = true;
        char firstCaracter;
        char lastCaracter;
        int count = 1;
        for (int i = 0; i < phraseSansEspace.length(); i++) {
            firstCaracter = phraseSansEspace.charAt(i);
            int size = phraseSansEspace.length();
            lastCaracter = phraseSansEspace.charAt(size - count);
            if (Character.toString(firstCaracter).equalsIgnoreCase(Character.toString(lastCaracter))) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
            count++;
        }

        return isPalindrome;
    }

}
