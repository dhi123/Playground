import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      
      Scanner in = new Scanner (System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int idx = 0 ; idx < arr_size ; idx++)
      {
         arr[idx] = in.nextInt();
      }
      int max;
      if( arr[0] > arr[1])
      {
        max = arr[0];
      }
      else
        max = arr[1];
      for(int idx = 2; idx < arr_size ; idx++)
      {
         if( max < arr[idx])
           max = arr[idx];
      }
    System.out.println(max);
    }
    
    }