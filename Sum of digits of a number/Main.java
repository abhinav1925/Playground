import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    	Scanner i= new Scanner(System.in);
		
		int n = i.nextInt();
      int s =0;
      while(n!=0)
      {
        s = s + (n%10);
        n = n/10;  
      }
      System.out.println(s);
	}
}