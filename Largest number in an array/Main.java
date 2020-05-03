import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = 0;
      int arr[] = new int[n];
      for(int i=0 ; i<=n-1 ; i++)
      {
        arr[i] = in.nextInt();
      }
      k = arr[0];
      for (int j=0 ; j<=n-1 ; j++)
      {
        if ( k < arr[j])
        {
          k = arr[j];
        }
      }
        System.out.print(k);
    }
}