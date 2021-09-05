package Palindrome;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String args[]){
        String original;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        original = input.nextLine();

        int length = original.length();
        int i, begin = 0, end = length-1, middle = (begin + end)/2;

        for (i = begin; i<= middle; i++){
            //if(original.equals(begin) == original.equals(end)){
            if (original.charAt(begin) == original.charAt(end)){
                begin++;
                end--;
            }
            else {
                break;
            }
        }
        if (i == middle + 1){
            System.out.println("Entered string is a palindrome.");
        }
        else {
            System.out.println("Entered string isn't a palindrome.");
        }
    }
}
