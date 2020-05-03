import java.util.Scanner;
class Main{
	public static int greatest(int n1, int n2)
    {
      if (n1 > n2)
      {
        return n1;
      }
      else
      {
        return n2;
      }
    }
  public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
    int n3 = in.nextInt();
    int i = in.nextInt();
    int j = in.nextInt();
    int cod = greatest(i,j);
    if (n3>i)
    {
      System.out.print(n3);
    }
    else
    {
      System.out.print(cod);
    }
	}
}