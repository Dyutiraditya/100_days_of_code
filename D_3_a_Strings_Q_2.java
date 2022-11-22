package Practice;

import java.util.Scanner;

//Given a route containing 4 direction (N E W S), find the shortest path to reach destination
                /*N y+1
                S y-1
                E x+1
                W x-1*/
public class D_3_a_Strings_Q_2 {
    static float getShortestPath (String path){
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            //North
            if(dir=='N'){
                y++;
            }
            //South
            else if(dir == 'S'){
                y--;
            }
            //East
            else if(dir=='E'){
                x++;
            }
            //West
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2-y2);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String path = sc.nextLine();
    System.out.println(getShortestPath(path));
}
}
