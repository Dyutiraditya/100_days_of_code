package Practice;

import java.util.Scanner;

//Input two numbers a and b and find a^b

public class D_2_a_ProblemsInLoops_VI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 1;

        for (int i = 1; i <= b; i++) {
            ans *= a;
            
        }
        System.out.println(ans);
    }
}
