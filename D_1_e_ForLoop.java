package P_1_Core_JAVA;

import java.util.Scanner;

public class D_1_e_ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number i:- ");
        int i =sc.nextInt();
        System.out.println();

        for (int j = i ; i <=100 ; i++) {
            System.out.println(i+ ". Hello World");
        }
    }
    
}
