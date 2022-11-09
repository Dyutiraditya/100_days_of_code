package P_1_Core_JAVA;

import java.util.Scanner;

public class D_1_b_Operators {
    public static void main(String[] args) {
            
Scanner sc = new Scanner(System.in); 

System.out.println("Enter first number:- ");  
    int a = sc.nextInt();
    System.out.println();

System.out.println("Enter second number:- ");
    int b = sc.nextInt();
    System.out.println();
        
//Arithmetic Operator

    /* +:- Addition
    * -:- Subtraction
    * %:- Divide
    * /:- Divide without remainder
    * *:- Multiplication
    */

int c =a*b;
System.out.println("The answer is" + c);

//Relational Operator

    /* ==:- Comparing the values
     * !=:- Not equal to
     * >/<:- Greater than or less than
     */

System.out.println("Relational Operator");
System.out.println(a==b);
System.out.println(a!=b);
System.out.println(a<=b);
System.out.println(a>b);
System.out.println();

//Logical Operators

        /* &&:-Logical AND
         * ||:- Logical OR
         * !:- Logical NOT
         */

System.out.println("Logical Operator");
System.out.println(a>=b && a==b);
System.out.println(a!=b || a>b);
System.out.println(!(a==b));
System.out.println();

//Assignment Operator

        /* =:- Assigning the value
        * +=:- a+b
        * -=:- a-b
        * /=:- a/b
        * %=:- a%b
        */

System.out.println("Assignment Operator");
System.out.println(a+=b);
System.out.println(a-=b); 
System.out.println(a%=b);
System.out.println(a/=b); 
System.out.println(); 

//Unary Operator

        /* +:- Unary plus
         * -:- Unary minus
         * ++:- Increment operator
                * Post * Pre
         * --:- Decrement operator
                * Post *Pre
         */

System.out.println("Unary Operator");
int e = ++a;
int d = --b;
System.out.println("Increment of a= " + e);
System.out.println("Decrement of b= " + d);
System.out.println();

//Precedence (Top to Bottom - High to Low)

        /* Postfix:- ++ --
        * Prefix:- ++ --
        * Unary:- ++ -- +- ! -
        * Multiplicative:- * / %
        * Additive:- + -
        * Shift:- << >> >>>
        * Relational:- < <= > >=
        * Equality:- == !=
        * Bitwise AND:- &
        * Bitwise XOR:- ^
        * Bitwise OR:- |
        * Logical AND:- &&
        * Conditionals:- ? : (*)
        * Assignment:- = += -= /= %= > >= < <= &= ^= |=(*)
        */



    }
    
}
