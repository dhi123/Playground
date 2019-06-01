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
      int search_Ele1 = in.nextInt();
      int search_Ele2 = in.nextInt();
      
      int index1 = -1;
      int index2 = -1;
    
      for(int idx = 0 ; idx < arr_size ; idx++)
      {
         if (search_Ele1 == arr[idx])
         {
            index1 = idx;
         }
        if(search_Ele2 == arr[idx])
         {
           index2 = idx;
         }
      }
           
      System.out.println(index1);
    System.out.println(index2);

   }
}