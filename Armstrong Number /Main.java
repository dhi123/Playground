import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner ( System.in );
      int num = in.nextInt();
      int sum = 0;
      int temp = num;
      int a;
      while( num > 0 )
      {
         a = num % 10;
         num = num / 10;
         sum = sum + ( a * a * a );
      }
      if( sum == temp )
        System.out.println("Armstrong Number");
      else
      {
        System.out.println("Not a Armstrong Number");
	
      }
    
     }
}