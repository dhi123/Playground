import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
        Scanner in = new Scanner (System.in);
        String str = in.nextLine();
        int len = str.length();
        int front = 0;
        int rare = len - 1;
        int flag = 1;
        while( front < rare)
        {
           if( str.charAt(front) != str.charAt(rare))
             flag = 0;
           front++;
           rare--;
        }
      if(flag == 1)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}