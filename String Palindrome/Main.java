import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int len = str.length();
        int j = len - 1;
        int i = 0;
        boolean count = true;
        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                count = false;
                break;
            }
            i++;
            j--;
        }
        if(count == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    } 
}