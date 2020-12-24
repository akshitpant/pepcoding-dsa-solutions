// Complete solution using : If - else statement and If-else-if ladder only
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max = a;
        
        if(b>a)
            {
            max=b;
            }
        if(c>a)
            {
            max=c;
            }
        
         if(max==a)
         {if(b*b + c*c ==a*a)
             System.out.println(true);
             else
             System.out.println(false);
         }
         else if(max==b)
         {if(a*a + c*c == b*b)
              System.out.println(true);
             else
             System.out.println(false);
         }
         else
         {if(a*a + b*b == c*c)
             System.out.println(true);
             else
             System.out.println(false);
         }
         }
       }