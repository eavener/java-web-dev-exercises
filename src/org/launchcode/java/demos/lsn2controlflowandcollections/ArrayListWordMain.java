package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;

public class ArrayListWordMain {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("tomato");
        words.add("lettuce");
        words.add("rutabaga");
        words.add("cabbage");
        words.add("beet");
        words.add("carrot");
        words.add("radish");
        words.add("kale");
        words.add("cucumber");
        words.add("apple");
        words.add("berry");
        AL5Finder.lengthFinder(words);
    }
}
