import java.util.Scanner;

public class Main{
public static void main(String arg[])
{
	Scanner in = new Scanner(System.in);
	String s = new String();
	s=in.nextLine();
	StringBuilder b = new StringBuilder();
	int c =s.length();
	for(int i=s.length()-1;i>=0;i--)
	{
		if(s.charAt(i)==' ')
		{
			
			b.append(s.substring(i+1,c));
		b.append(' ');
			 c = i;
		}
		if(i==1)
		{
			b.append(s.substring(i-1,c));
		}
	}
	
	System.out.println(b);
}
}
