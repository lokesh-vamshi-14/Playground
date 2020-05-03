import java.util.Scanner;
class Main{
	public static int sum_of_numbers(int n)
    {
      int m = 1;
      int j = 1;
      while (m<n)
      {
        m=m+1;
        j=j+m;
      }
      return j;
    }
  public static void main (String[] args){
	    // Type your code here
    Scanner in = new Scanner(System.in);
    int sum = in.nextInt();
    int i = sum_of_numbers(sum);
    System.out.print(i);
	}
}