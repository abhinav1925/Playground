import java.util.Scanner;
class Main{
	public static void main (String[] args){
	      Scanner in =new Scanner(System.in);
         int n1 = in.nextInt();
         int n2 = in.nextInt();
         int n3 = in.nextInt();
      compare(n1,n2,n3);
      
	}
  public static void compare(int n1,int n2,int n3){
    if(n1>n2){
      if(n1>n3){
        System.out.println(n1);
      }else{
         System.out.println(n3);
        }
      }else if(n2>n3){
             System.out.println(n2);
    }else{
      System.out.println(n3);
    }
  }
}