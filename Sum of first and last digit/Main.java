import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int last = n%10;
   
      while(n!=0)
      {
        if(n/10 == 0)
          break;
        n=n/10;
        
      }
      int s = n;
        int sum = s + last;
      System.out.println(sum);
	}
}