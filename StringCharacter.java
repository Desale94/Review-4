package com.bridgelabz.string;

public class StringCharacter {
    public static void main(String[] args) {

        String str="Hello&welcome$to*java%program&";
        System.out.println("String before remove special character: ");
        System.out.println(str);
        System.out.println();

        String str2=str.replaceAll("[@$#!%^&*]"," ");
        System.out.println("String after remove special character: ");
        System.out.println(str2);
    }
}
