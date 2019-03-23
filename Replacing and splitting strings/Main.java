import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
        Scanner in = new Scanner(System.in);
      
      String l=in.nextLine();
      String l1 = in.nextLine();
      int n = in.nextInt();
      
      String a[] = l1.split(" ");
      
      for(String c : a)
      {
        System.out.println(c);
      }

    }
}