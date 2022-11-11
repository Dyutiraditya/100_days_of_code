package Practice;

import java.util.Scanner;

//Reverse of a digit

public class D_2_a_ProblemsInLoops_III {
    public static void main(String[] args) {
        
        // Ans * 10 + n%10

        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        int reverse = 0;

        while(n>0){
            reverse = reverse* 10 + n%10;
            n=n/ 10;
        }
        System.out.println( reverse );
    }
    
}
