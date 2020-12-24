import java.util.*;

public class Main {

    public static void main(String[] args) {
        
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      //for perefct squares upto root n.
      for(int i=1;i*i<=n;i++)
      {
          // NOTE: print of perfect squares
         System.out.println(i*i); 
      }
        
    }
}