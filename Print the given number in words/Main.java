import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        switch(a){
            
          case 1:
            System.out.print("One");
            break;
             case 2:
            System.out.print("Two");
            break;
             case 3:
            System.out.print("Three");
            break;
             case 4:
            System.out.print("Four");
            break;
             case 5:
            System.out.print("Five");
            break;
            
          default:
            System.out.print("Invalid");
        }
	}
}