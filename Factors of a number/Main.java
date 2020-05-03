import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = 0;
      for (int num = 1 ; num <= n ; num = num + 1)
      {
        count = count + 1;
        if (n%count == 0)
        {
          System.out.println(count);
        }
      }
	}
}