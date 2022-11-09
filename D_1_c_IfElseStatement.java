package P_1_Core_JAVA;

import java.util.Scanner;

public class D_1_c_IfElseStatement {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:- ");
        int firstNumber = sc.nextInt();
        System.out.println();

        System.out.println("Enter second number:- ");
        int secondNumber = sc.nextInt();
        System.out.println();

        if (firstNumber > secondNumber){
            System.out.println("First one greater than second");
        }else if (secondNumber > firstNumber){
            System.out.println("Second one is greater than first");
        }else{
            System.out.println("They are equal");
        }
    }
}
