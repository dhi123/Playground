import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
        Scanner in = new Scanner ( System.in );
	  int num = in.nextInt();
      int count =1;
      for(int i = 1 ; count <= num ; i++)
      {
         if( i % 2 == 1)
         {  System.out.println(i);
        	count++;
      }
	}
    }  
}