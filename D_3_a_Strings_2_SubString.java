package P_1_Core_JAVA;

import java.util.Scanner;


public class D_3_a_Strings_2_SubString {

    public static String substring(String str, int si, int ei){
        String subtr = " ";
        for (int i = si; i < ei; i++) {
            subtr += str.charAt(i);
        }
        return subtr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int si ;
        int ei ;
        System.out.print("Starting Index:- ");
        si=sc.nextInt();
        System.out.print("Ending Index:- ");
        ei = sc.nextInt();

        System.out.print("String :- ");
        String str = "Hello";
        
        System.out.print (substring(str , si , ei)); //Here we can also use str.substring(si,ei)

    }
}
