package P_1_Core_JAVA;

import java.util.Scanner;

class Algebra {
    int add(int a,int b){
        int ans = a + b;
        return ans;
    
    }
}

public class D_2_b_FunctionsInJava {
    
    //Methods are block of code performing some action which runs only when it is called.
    //Functions are called just by their name while method is called by their object

    /* Why methods are important in Java?
     * Write once reuse many time
     * Time save
     * Duplicate code reduces
     */

     /*Types of Methods
      * User Defined Method:- Made by developer
      * Standard library method:- Already present in Java
      */

      /*Anatomy
       * public int sum (int a, int b){
       * //Code to be executed
       * }
       * Access modifiers + return type + Method name + (Parameter){
       *                     Method Body
       * }
       */

            /* METHOD SIGNATURE
             *  EX:- sum(int a,int b)
             * Method name + Parameter list
            */

       /*CALL A METHOD
       To call a method in Jva, you have to write the methods name followed by two parentheses () and a semicolon;
         */     
        
        /* Static void welcome(){
            System.out.println("Welcome to My house");
         } */

            /* STATIC VARIABLE
             * Static int b;
             * Single copy for whole class
             */

             /* INSTANCE VARIABLE
              * int b;
              * All objects will make their own copy
              */

         public static void main(String[] args) {
            Algebra obj = new Algebra();
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("");
         }

    }
