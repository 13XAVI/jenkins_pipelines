package org.example;

public class ConvertToUpper {
     public static void main(String[] args) {
        StringBuilder capitalized = new StringBuilder();
        for (String word : args) {
           capitalized.append( Capitalize(word) + " ");
        }
        System.out.println(capitalized);
    }
    public static String Capitalize(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
