package Practice;

import java.util.Scanner;

//S=1-2+3-4+5-.........n

public class D_2_a_ProblemInLoops_IV {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for (int i = 1; i <= n ; i++) {
            if(i%2 == 0){
                ans -= i;
            }else{
                ans +=i;
            }
            
        }
        System.out.println(ans);
    }
}
