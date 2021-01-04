//using for and while loop
import java.util.*;

public class Main {

    public static void main(String[] args) {
       

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         int t = 0;
        for(int i=1;i<=n;i++)
        { 
          
           while(t!=i)
           {
            System.out.print("*\t");
            t++;
           }
           System.out.println();
         t=0;  
        }
       
       

    }
}