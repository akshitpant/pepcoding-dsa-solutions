import java.util.*;

public class Main{

public static void main(String[] args) {

Scanner scn = new Scanner(System.in);
int n = scn.nextInt();

// op == original position, od == original digit
 // ip == inverted position, id == inverted digit
 // inv == inverse of number
 int inv=0;
 int op=1;
 
 while(n!=0)
 {
  int od = n%10;
  // od to get last digit of original digit
  int ip= od;
  int id= op;
  // forming inv using ip and od
  inv = inv + id*(int)Math.pow(10,ip-1);
  n=n/10;
  op++;
  
 }
 System.out.println(inv);



 }
}