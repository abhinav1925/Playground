import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner in= new Scanner(System.in);
		int num=1;
		int n = in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          System.out.print(num);
        }
        System.out.print("\n");
        num++;
      }
	}
}