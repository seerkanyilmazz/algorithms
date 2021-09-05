package findWordCount;

import java.util.Scanner;

public class FindWordCount {
    public static void main(String[] args){
        int count = 0;
        System.out.println("Enter your paragraph: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) ==' '){
                count++;
            }
        }
        System.out.println("Number of words in paragraph: "+(count+1));
    }
}
