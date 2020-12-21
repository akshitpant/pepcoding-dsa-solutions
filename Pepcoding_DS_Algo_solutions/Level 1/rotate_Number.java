import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
    
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    
    // to count total digits of number
    int count = 0;
    int temp = n;
    while(temp!=0)
    {
      temp=temp/10;
      count++;
    }
    // for k>n
    k = k % count;
    //this line will reduce k>n to range within
    
    //for -ve rotation side
    if(k<0)
    {
      k = k + count;  
    }
    
    //breaking the number into 2 to rotate it,   div==divisor ,   mul==multiplier
    int div = 1;
    int mul = 1;
    for(int i=1;i<=count;i++)
    {    if(i<=k)
           {
            div=div*10;   
            }
         else
            {
             mul=mul*10;    
            }
    }
     
     int q= n/div;
     int r= n%div;
     
     int rotate= r*mul + q;
     System.out.println(rotate);
    }
   }