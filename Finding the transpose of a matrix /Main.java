import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int mat1[][] = new int[r][c];
    for (int i=0 ; i<r ; i++)
    {
      for (int j=0 ; j<c ; j++)
      {
        mat1[i][j] = in.nextInt();
      }
    }
    int mat2[][] = new int[c][r];
    for (int i=0 ; i<r ; i++)
    {
      for (int j=0 ; j<c ; j++)
      {
        mat2[i][j] = mat1[j][i];
      }
    }
   for (int k = 0 ; k<r ; k++)
    {
      for(int l = 0 ; l<c ; l++)
      {
        System.out.print(mat2[k][l]+" ");
      }
      System.out.println();
    } 
  }
}