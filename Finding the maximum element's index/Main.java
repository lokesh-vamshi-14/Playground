import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    int cod = 0;
    for (int i=0 ; i<=n-1 ; i++)
    {
      a[i] = in.nextInt();
    }
    int k = a[0];
    for (int j=0 ; j<=n-1 ; j++)
    {
      if (k<a[j])
      {
        k=a[j];
      }
    for (int l = 0 ; l<=n-1 ; l++)
    {
      if (a[l]==k)
      {
        cod = l;
      }
    }
    }
  System.out.print(cod);
  }
}