import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        String s = new String();
        String c = new String();
        String v = new String();
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        c=in.nextLine();
        int a = s.length();
        int b = c.length();
        int con=0;
        for(int i=0;i<a-1;i++)
        {
        	int g=i+b;
        	if(!(g>=a-1))
        	{
        	v=s.substring(i,g);
        	
        	
        	if(c.equals(v))
        	{
        	   con++;
        	}
        	}
        }
       System.out.println(con+1);

    }
}