package Practice;

import java.util.Scanner;

//Find the sum of digits in a given number n 

public class D_2_a_ProblemsInLoops_II {
    public static void main(String[] args) {
        
        //Any no. % 10 = Last digit of no.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfDigits = 0;
        int original_n = n;

        while(n>0){
            sumOfDigits += n%10;
            n = n/10;
        
        }
        System.out.println("Number of digits in " + original_n + "="+ sumOfDigits);
    }
    
}
