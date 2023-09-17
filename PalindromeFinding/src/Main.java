import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter a sentence: ");
        String sentence = scanner.nextLine();
        Stack<Character> sentence_stack = new Stack<>();

        //kasaylabalyasak
        int sentence_half_length = sentence.length()/2;
        for (int i =0;i<sentence_half_length;i++){
            char c = sentence.charAt(i);
            sentence_stack.push(c);

        }
        if (isPalindrome(sentence,sentence_stack))
            System.out.println("This is a Palindrome Sentence");
        else
            System.out.println("This is not a Palindrome Sentence");




    }
    public static boolean isPalindrome(String sentence,Stack<Character> stack){

        for(int j =(sentence.length()/2)+1;j<sentence.length();j++){
            if(stack.pop()!=sentence.charAt(j)){
                return false;
            }


    }
        return true;
}}