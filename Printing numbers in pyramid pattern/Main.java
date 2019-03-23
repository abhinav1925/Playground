import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	  Scanner in =new Scanner(System.in);
    int n = in.nextInt();
    int c=2;
      int num=1;
   
    for(int i=1;i<=n;i++)
       
    { 
       int  x=n-c;
      while(x>=0){
           System.out.print(" ");
        x--;
      }
      for(int j=1;j<=i;j++){
      
        System.out.print(num);
        System.out.print(" ");
        num++;
      }
      System.out.print("\n");
      c++;
    }
    }    
}