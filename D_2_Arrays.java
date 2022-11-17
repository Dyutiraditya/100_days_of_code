package P_1_Core_JAVA;


class ArraysExample{

    void multiArrays(){
        int [][] arr_1 = new int[5][3];
        int [][] arr = {{87,9,86},{567,876,7},{65,35,980},{876,65,34},{65,45,87}};

            System.out.println(arr[0][0]);
            System.out.println(arr[0][1]);
            System.out.println(arr[0][2]);
            System.out.println();

            System.out.println(arr[1][0]);
            System.out.println(arr[1][1]);
            System.out.println(arr[1][2]);
            System.out.println();

            System.out.println(arr[2][0]);
            System.out.println(arr[2][1]);
            System.out.println(arr[2][2]);
            System.out.println();

            


    }

    void demoArrays (){
    int []ages = new int [3]; 
    float [] weight = new float [5];
    String [] names = {"Rahul" , "Raj", "Aradhya"};


    ages[0] = 34;
    ages[1] = 43;
    ages[2] = 5;
    
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[0]);

        System.out.println();
        
        System.out.println(ages.length);
        System.out.println(weight.length);
        System.out.println(names.length);

}
}

public class D_2_Arrays {
    
     //Arrays is a data structure which stores a collection of homogeneous items
     //Arrays have zero based indexing

     public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        obj.demoArrays();
          //obj.multiArrays();
     }
}
