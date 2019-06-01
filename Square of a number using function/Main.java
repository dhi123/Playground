import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner (System.in);
      int num = in.nextInt();
      square(num);
	} 
  public static void square(int num)
  {
  	  int sq = num * num;
    System.out.println(sq);
  }
}