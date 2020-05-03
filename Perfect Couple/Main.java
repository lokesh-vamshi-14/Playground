import java.util.Scanner; 

class Main{ 

  public static void pairs(int arr_size, int arr[], int value) 

  { 

    for (int i = 0; i<=arr_size-1 ; i++) 

    { 

      for (int j=i+1 ; j<=arr_size-1 ; j++) 

      { 

        int sum = arr[i] + arr[j]; 

        if (sum == value) 

        { 

          System.out.println(arr[i]+", "+arr[j]); 

        } 

      } 

    } 

  } 

  public static void main(String args[]) { 

      // Type your code here 

    Scanner in = new Scanner(System.in); 

    int n = in.nextInt(); 

    int arr[] = new int[n]; 

    for (int k = 0 ; k<=n-1 ; k++) 

    { 

      arr[k] = in.nextInt(); 

    } 

    int n1 = in.nextInt(); 

    pairs(n,arr,n1); 

    } 

} 