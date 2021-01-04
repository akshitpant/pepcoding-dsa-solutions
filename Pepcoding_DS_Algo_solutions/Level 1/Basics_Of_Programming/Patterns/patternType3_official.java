import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // sp == space , st == star 
        int sp = n-1;  // for spaces in 1st line
        int st = 1;    //for stars in 1st line
        

       for(int i=1;i<=n;i++)
       { 
          //SOP(sp+","+st);
        
          for(int j=1;j<=sp;j++)
          {
           System.out.print("\t");   
          }
        
         for(int j=1;j<=st;j++)
          {
            System.out.print("*\t");   
          }
          
        sp--;
        st++;
        System.out.println();
           
       }
       
       
       

    }
}