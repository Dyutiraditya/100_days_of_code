package Practice;

import java.util.Scanner;

//Count the number of digits for a given number n

public class D_2_a_ProblemInLoop_I {
    public static void main(String[] args) {
        
    //Divide n by 10 until n>0 and count the number of divisions

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int numberOfDigits = 0;
    int original_n = n;

    while(n>0){
        n= n/10;
        numberOfDigits++;
    }
    System.out.println("Number of digits in " + original_n + "=" + numberOfDigits );
    }
    
}
