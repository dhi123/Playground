import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for(int idx = 0 ; idx < num ; idx++)
      System.out.println("*");
  }
}