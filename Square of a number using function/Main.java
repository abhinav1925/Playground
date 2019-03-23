import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
        Scanner in =new Scanner(System.in);
    int n = in.nextInt();
	System.out.println(sqy(n));
	} 
  
  public static int sqy(int a){
    int y = a*a;
    return y;
  }
}