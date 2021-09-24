package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        HashMap<Character, Integer> countHashMap = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = input.nextLine();
        input.close();
        //String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = phrase.toCharArray();
        for (char c : charactersInString){
            char i = Character.toUpperCase(c);
            if (!countHashMap.containsKey(i)) {
                countHashMap.put(i, 1);
            }
            else {
                countHashMap.put(i, countHashMap.get(i)+1);
            }
        }
        System.out.println(countHashMap);
    }

}
