package ReverseWords;

import java.util.Scanner;

public class ReverseWords {
    public void reverseWord(String str){
        String[] words = str.split(" ");
        String reversedString = "";

        for (int i = 0; i < words.length ; i++){
            String word = words[i];
            String reverseWord = "";

            for (int j = word.length()-1; j >=0; j--){
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(str);
        System.out.println(reversedString);
    }
    public static void main(String[] args){
        ReverseWords obj = new ReverseWords();
        System.out.println("Enter your sentence: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        obj.reverseWord(string);
    }
}
