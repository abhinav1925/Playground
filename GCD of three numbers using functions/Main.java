import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	  	      Scanner in =new Scanner(System.in);
         int n1 = in.nextInt();
         int n2 = in.nextInt();
         int n3 = in.nextInt();
         System.out.println(gcd(gcd(n1,n2),n3));
	}
  public static int gcd(int n1,int n2)
  {
    int min;
    int gcd=0;
    if(n1>n2)
    {
       min = n2;
    }else
    {
      min = n1;
    }
    
    while(min>=0){
      if(n1%min==0 && n2%min==0)
      {
        gcd=min;
        break;
      }else{
        min--;
      }
      
    }
    return gcd;
  }
}