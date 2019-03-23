import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
      char s = in.next().charAt(0);
      int a = in.nextInt();
      if(s>='a' && s<='z')
      {
      int f = 97-s;

      if(f<=0)
      {
        char b  = (char)((s+26)-a);
        System.out.println(b);
      }else
      {
      char b  = (char)(s-a);
      System.out.println(b);
      }
      }
      
      if(s>='A' && s<='Z')
      {

    	     char b  = (char)(s-a);
    	      System.out.println(b);
      }
    }
}