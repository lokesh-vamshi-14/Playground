import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      String str3 = in.nextLine();
      String str4 = str1.replace(str2, str3);
      System.out.print(str4);  
    }
}