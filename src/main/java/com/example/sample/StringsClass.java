package com.example.sample;

public class StringsClass {

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf("B"));
        String str2 = "Doe";
        String str3 = "John";
        System.out.println(str3 + " " + str2);
        System.out.println(str3.concat(" " + str2));
        //Add number and a string the result will be string concatenation
        int num = 20;
        System.out.println(str3 + num);
        System.out.println("It's alright!");
        System.out.println("We are the so-called \"Vikings\" from the north.");
    }

}
