import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      
            	Scanner in= new Scanner(System.in);
		
		int n = in.nextInt();
        int k =n;
		int f =n;
		int y;
		int sum =0;
       while(k!=0) {
		 y = k%10;
		 int e =1;
		  for(int i=1;i<=y;i++)	{
			  e=i*e; 
		  }
		
			sum=sum+e;
		
			k=k/10;
		}
		
		if(sum==f) {
			System.out.println("Yes");
		}else
		{
			System.out.println("No");
		}
      
	}
}