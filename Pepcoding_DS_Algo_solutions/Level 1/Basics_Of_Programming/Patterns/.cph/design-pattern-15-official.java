import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // input condition :   n is ODD.
        int sp = n/2;
        int st = 1;
        
        int x=1;
        
        for(int i = 1;i<=n;i++)
        {
          for(int j=1;j<=sp;j++)
          {System.out.print("\t");
              }
              
              //cx == column change in x
              int cx = x;
              
          for(int j=1;j<=st;j++)
          {System.out.print(cx+"\t");
          if(j<=st/2)
          {cx++;
           }
          else
          { cx--; }
            }
              
        
          if(i <=n/2)
          {
           sp=sp-1;
           st=st+2;
            x++;
          }
          
          else
          {
            sp=sp+1;
            st=st-2;
            x--;
          }
          System.out.println();
        }
        
    }
}