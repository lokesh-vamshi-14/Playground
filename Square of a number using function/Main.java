import java.util.Scanner;
class Main
{
  public static int square_root(int m)
  {
    int product = m*m;
      return product;
}
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int square = square_root(n);
      System.out.print(square);
	} 
}