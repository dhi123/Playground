import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuffer sb = new StringBuffer(str);
      int freq[] = new int[26];
      for(int idx = 0 ; idx < 26; idx++)
        freq[idx] = 0;
      
      for(int idx = 0 ; idx < str.length() ; idx++)
      {
         if(sb.charAt(idx) >= 'A' && sb.charAt(idx) <= 'Z')
         {
            freq[sb.charAt(idx) - 'A']++;
         }
        if(sb.charAt(idx) >= 'a' && sb.charAt(idx) <= 'z')
         {
            freq[sb.charAt(idx) - 'a']++;
         }
      }
     for(int idx = 0 ; idx <= 25 ; idx++)
     {
        if(freq[idx] == 0)
        {
           char mAlpha = (char)(idx + 'a');
          System.out.print(mAlpha + " ");
        }
     }
    }
}