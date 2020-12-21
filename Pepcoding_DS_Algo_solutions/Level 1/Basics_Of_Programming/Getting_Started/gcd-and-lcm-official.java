import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    
    //original numbers for lcm using formula
    int On1=n1;
    int On2=n2;
    
    
    while(n1%n2!=0)
      {
        int rem = n1%n2;
        //for subsequent divisions
        n1=n2;
        n2=rem;
        }
        int gcd = n2;
        
        //for LCM using maths formula
        //On1== original n1, On2== original n2
        int lcm = (On1*On2)/gcd;
        
        System.out.println(gcd);
        System.out.println(lcm);
      
     }
    }