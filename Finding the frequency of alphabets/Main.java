import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int len = sb.length();
      int freq[] = new int[26];
      for (int i = 0; i<26 ; i++)
      {
        freq[i] = 0;
      }
      for (int idx = 0 ; idx<len ; idx++)
      {
        if (sb.charAt(idx)>='A' && sb.charAt(idx)<='Z')
        {
          int offset = str.charAt(idx) - 'A';
          char cod = (char)('a' + offset);
          sb.setCharAt(idx , cod);
        }
        if (sb.charAt(idx)>='a' && sb.charAt(idx)<='z')
        {
          int offset1 = sb.charAt(idx) - 'a';
          freq[offset1]++;
        }
      }
      for (int i =0 ; i<len ; i++)
      {
        int offset2 = sb.charAt(i)-'a';
        if (freq[offset2]!=0)
        {
          System.out.print(sb.charAt(i));
          System.out.print(freq[offset2]+" ");
          freq[offset2]=0;
        }
      }
    }
}