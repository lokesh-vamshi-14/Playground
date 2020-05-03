import java.util.Scanner;
class Main
{
  public static int factorial(int i)
  {
    if (i>0)
    {
      return i+factorial(i-1);
    }
    else 
    {
      return 0;
    }
  }
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int cod = factorial(n);
    System.out.print(cod);
  }
}