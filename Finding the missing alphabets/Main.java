import java.util.Scanner; 

class Main{ 

    public static void main(String args[]){ 

      // Type your code here 

      Scanner in = new Scanner(System.in); 

      String str = in.nextLine(); 

      int len = str.length(); 

      int freq[] = new int[26]; 

      for (int i = 0; i<26 ; i++) 

      { 

        freq[i] = 0; 

      } 

      for (int idx = 0 ; idx<=len-1 ; idx++) 

      { 

        if(str.charAt(idx)>='A' && str.charAt(idx)<='Z') 

        { 

          int offset = str.charAt(idx) - 'A'; 

          freq[offset]++; 

        } 

      } 

      for (int idx = 0 ; idx<=len-1 ; idx++) 

      { 

        if('a'<=str.charAt(idx) && str.charAt(idx)<='z') 

        { 

          int offset = str.charAt(idx) - 'a'; 

          freq[offset]++; 

        } 

      } 

      for (int i = 0 ; i<26 ; i++) 

      { 

        if (freq[i] == 0) 

        { 

          char cod = (char)('a' + i); 

          System.out.print(cod+" "); 

        } 

      } 

    } 

} 