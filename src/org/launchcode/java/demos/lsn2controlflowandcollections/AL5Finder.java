package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class AL5Finder {
public static void lengthFinder(ArrayList<String> wordsOfLength) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a word length to search for: ");
    int wordLength = in.nextInt();
    for (String string : wordsOfLength) {
        if (string.length() == wordLength) {
            System.out.println(string);
        }
    }

}
}
