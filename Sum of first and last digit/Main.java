import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
        Scanner in = new Scanner ( System.in );
      int num = in.nextInt();
    	if(num % 10 == 0)
        {
        	int firstNum = num / 1000 ;
          	System.out.println(firstNum);
        }
      	else
        {
           int firstNum = num / 10000;
           int lastNum = num % 10;
          System.out.println(firstNum + lastNum);
         }
    
    }
}