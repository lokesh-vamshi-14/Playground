import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int p = 1;
      for ( int num = 1; num <= n; num = num + 1)
      {
        p = p*num;
      }
      System.out.println(p);
	}
}