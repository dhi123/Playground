import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner (System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      
      for(int idx =0 ;idx <arr_size ; idx++)
        arr[idx] = in.nextInt();

      szeros(arr,arr_size);
      
      for(int idx =0 ;idx <arr_size ; idx++)
        System.out.print(arr[idx]+" ");
    }
   public static void szeros(int arr[], int arr_size)
   {
      int count = 0;
     for(int idx = 0 ; idx < arr_size ; idx++)
     {
       if(arr[idx] != 0)
       {   
          int temp = arr[idx];
          arr[idx] = arr[count];
          arr[count] = temp;
          count++;
       }     
     }
   
   
   }


}
