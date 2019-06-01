import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for(int idx = 1 ; idx <= num ; idx++)
    {
      if(idx % 3 ==0)
      System.out.print(idx + ",");
     else
       System.out.print(idx);
    }

  }
}