import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // sp == spaces , st == stars
        int sp = 0; 
        int st = n;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sp;j++)
             {
              System.out.print("\t"); 
             }
           
            for(int j=1;j<=st;j++)
             {
              System.out.print("*\t"); 
             }
            
            st--;                         // star decrement for every next line
            sp++;                         // spaces increment for every next line
            System.out.println();        // next line
            
        }



    }
}