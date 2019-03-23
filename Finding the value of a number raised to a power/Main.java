import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
      int n = in.nextInt();
      int d = in .nextInt();
      int f=n;
      for(int i=1;i<d;i++)
      {
        f = n*f;
      }
      System.out.println(f);
    }
}