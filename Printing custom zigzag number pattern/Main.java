import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in =new Scanner(System.in);
	    int n = in.nextInt();
      int num=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++){
        	if(i%2==0){
              if(j==1){
                System.out.print(num);
              }else{
                 System.out.print(num-1);
              }
            }else{
                if(j==n){
                System.out.print(++num);
              }else{
                 System.out.print(num);
              }
              
            }
          
       }
           System.out.print("\n");
     if(i%2!=0)
     {
        num++;
     }
      }

	}
}