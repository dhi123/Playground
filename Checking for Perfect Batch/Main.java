import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner (System.in);
    int  n = in.nextInt();
    int list[] = new int[n];
    for(int idx = 0 ; idx < n ; idx++ )
       list[idx] = in.nextInt();
    batch(list,n);
  }
  public static void batch(int list[] , int n)
  {
     int sum1 = list[0] + list[1] + list[2] ;
    int sum2 = 0;
    for(int idx = 3 ; idx < n ; idx = idx + 3)
    {
        sum2 = list[idx] + list[idx+1] + list[idx+2];
    }
    if(sum1 == sum2) 
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  
  
  }
}