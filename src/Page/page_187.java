package Page;

import java.util.Scanner;

public class page_187 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        // The index of the first character in the string
        int firstChar = 0;
        // The index of the last character in the string
        int lastChar = s.length() - 1;
        boolean isPalindrome = true;
        while (firstChar < lastChar){
            if (s.charAt(firstChar) != s.charAt(lastChar)){
                isPalindrome = false;
                break;
            }
            firstChar++;
            lastChar--;
        }
        if (isPalindrome)
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}
