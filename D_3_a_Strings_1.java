package P_1_Core_JAVA;

import java.util.Scanner;

public class D_3_a_Strings_1 {
    static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    char arr[] = {'a','b','c','d'};
    String str = "abcd";
    String str_2 = new String("xyz");

    //Strings are immutable
    Scanner sc = new  Scanner(System.in);
    /*String name = sc.nextLine();
    System.out.println(name);*/

        //Concatenation
        /*String firstName = "Dyutiraditya";
        String lastName = "Patri";
        String fullName = firstName +" "+lastName;
        System.out.println(fullName);
        printLetters(fullName);*/
    
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    String s3 = new String(sc.nextLine());

        if(s1.equals(s2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        if(s1.equals(s3)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

    }
    
}
