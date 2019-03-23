import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner c = new Scanner(System.in);
      int i =c.nextInt();
      
      if(i>=85){
        System.out.println("A");
      }
      else if(i>=75){
         System.out.println("B");
      }
      else if(i>=65){
         System.out.println("C");
      }
      else if(i>=55){
         System.out.println("D");
      }
      else if(i>=45){
         System.out.println("E");
      }
      else
      {
          System.out.println("Fail");
      }
    }
}