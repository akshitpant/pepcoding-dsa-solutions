import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n =scn.nextInt();
    
    int st =1;
    int sp = 2*n-3;
    
    
    for(int i=1;i<=n;i++)
    {
      int temp =1;  
     for(int j=1;j<=st;j++)
     {
        System.out.print(temp + "\t"); 
        temp++;
     }
     
     // printing of spaces by...... 2(n-2)+1
     // i.e., by......2n-3
     for(int j=1;j<=sp;j++)
     {
       System.out.print("\t");
       
     }
     
     //for last row
     if(i==n)
     {st--;
     temp--;    
     }
     
     for(int k=1;k<=st;k++)
     {  temp--;
        System.out.print(temp + "\t"); 
        
     }
     
     st++;
     sp=sp-2;
      System.out.println();
    }
  

 }
}