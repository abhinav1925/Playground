import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      	Scanner in= new Scanner(System.in);
		
		int n = in.nextInt();
		int count=1;
		int k =n;
		int f =n;
		int y;
		int sum =0;
			
		while(n/10!=0)
		{
			n =n/10;
			count++;
		}
		
		while(k!=0) {
		 y = k%10;
		 int e =1;
		  for(int i=1;i<=count;i++)	{
			  e=y*e; 
		  }
		
			sum=sum+e;
		
			k=k/10;
		}
		
		if(sum==f) {
			System.out.println("Armstrong Number");
		}else
		{
			System.out.println("Not a Armstrong Number");
		}
		
	}
}