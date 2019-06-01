import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int base = in.nextInt();
      int exp = in.nextInt();
      
      System.out.println(powerOf(base,exp));
      }
  public static int powerOf(int base, int exp)
  {
     int power = 1;
    while (exp != 0 )
    {
       power = base * power;
       exp --;
    }
    return power;
  }
}