package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        String samIAm = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] samIAmArray = samIAm.split(" ");
        System.out.println(Arrays.toString(samIAmArray));

        String[] samIAmArrayDeux = samIAm.split("\\.");
        System.out.println(Arrays.toString(samIAmArrayDeux));
    }
}