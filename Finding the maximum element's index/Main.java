import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n =in.nextInt();
    int[] arr =new int[n];
    int d=0;
    int v =0;
    for(int i=0;i<n;i++)
    {
      arr[i] = in.nextInt();
    }
    
    for(int i=0;i<n;i++)
    {
      if(arr[i]>d)
      {
        d=arr[i];
        v=i;
      }
    }
    
    System.out.print(v);
  }
}