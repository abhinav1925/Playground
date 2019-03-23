import java.util.Scanner;

public class Main {
	
	public static void main(String arg[]) {
		Scanner i= new Scanner(System.in);
		
		int n = i.nextInt();
		int last = n%10;
		while(n/100 != 0)
		{
			n = n/10;
		}
		int s = n%10;
		System.out.println(s);

		
	}

}