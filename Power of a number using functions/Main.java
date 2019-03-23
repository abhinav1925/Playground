import java.util.*;
class Main
{
public static void main(String args[])
{
    Scanner in =new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();

 System.out.println(add(n1,n2));
}
  
     private static int add(int a,int b){
    	 
  	   int sum=1;
   for(int i=1;i<=b;i++){
	  
   sum = sum*a;
     
   }
   return sum;
  }
}

