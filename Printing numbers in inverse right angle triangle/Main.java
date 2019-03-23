import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in =new Scanner(System.in);
    int n = in.nextInt();
    int c=n;
      int k=0;
   
    for(int i=1;i<=n;i++)
       
    { 
      c=n;
      c=c-k;
      for(int j=n;j>=i;j--){
      
        System.out.print(c);
       c--;
      }
      System.out.print("\n");
    k++;
    }
	}
}