import java.util.Scanner;
class Main{
	public static int power(int i, int j)
    {
      int num = 1;
      int k = 1;
        while (num<=j)
      {
        k = k*i;
          num=num+1;
        }
      return k;
    }
  public static void main (String[] args){
	    // Type your code here
    Scanner in = new Scanner(System.in);
    int l = in.nextInt();
    int m = in.nextInt();
    int cod = power(l, m);
    System.out.print(cod);
	}
}