package Practice;

import java.util.Scanner;

//Print first n factorial numbers

public class D_2_a_ProblemInLoops_V {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;

        for (int i = 1; i <=n ; i++) {
            ans = ans * i;
            
        }
        System.out.println(ans);
    }    
}
