import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int count=0;
      int n =in.nextInt();
      for(int i =1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if(count%2==0)
          {
            System.out.print("*");
          }
          else{
               System.out.print("#");
          }
          count++;
        }
           System.out.print("\n");
        
      }
    }
}