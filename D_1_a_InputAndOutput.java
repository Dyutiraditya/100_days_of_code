package P_1_Core_JAVA;

import java.util.Scanner;

public class D_1_a_InputAndOutput {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter principal= ");
        float principal = sc.nextFloat();

        System.out.println("Enter interest= ");
        float interest = sc.nextFloat();

        System.out.println("Enter time= ");
        float time = sc.nextFloat();

        float si = principal*interest*time/100;

        System.out.println("The simple interest is= "+si);


    }
    
}
