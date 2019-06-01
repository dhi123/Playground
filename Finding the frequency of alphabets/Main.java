import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int freq[] = new int [26];
      for(int idx = 0 ; idx < 26 ; idx++)
        freq[idx] = 0;
        
      for(int idx = 0 ; idx < str.length(); idx++)
      {
         if(sb.charAt(idx) >= 'A' && sb.charAt(idx) <= 'Z')
         {
            int offset = sb.charAt(idx) - 'A';
            char ch = (char) ('a' + offset);
           sb.setCharAt(idx,ch);
         }
        if(sb.charAt(idx) >= 'a' && sb.charAt(idx) <= 'z')
        {
           freq[sb.charAt(idx) - 'a']++;
        }
      }
      for(int idx = 0 ; idx < str.length() ; idx++)
      {
         if( freq[sb.charAt(idx) - 'a' ] != 0)
         {
            System.out.print(sb.charAt(idx) +"" +freq[sb.charAt(idx) - 'a'] +" ");
            freq[sb.charAt(idx) - 'a'] =0;
         }
      }
    }
}