package Practice;

import java.util.Scanner;

//Check if a String is a palindrome

public class D_3_a_Strings_Q_1 {
   public static boolean ispalindrome(String str){
    for (int i = 0; i < str.length()/2; i++) {
        int n = str.length();
        if(str.charAt(i)!= str.charAt(n-1-i)){
            return false;
        }

    }return true;
    }
    

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(ispalindrome(str));
}
}

