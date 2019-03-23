import java.util.Scanner;
class Main{
	public static void main (String[] args){
      
      Scanner in = new Scanner(System.in);
      int s = in.nextInt();
      
      for(int i=1;i<=s;i++){
        if(s%i==0){
          System.out.println(i);
        }
      }
	    
    }
}