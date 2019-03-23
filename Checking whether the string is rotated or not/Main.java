import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner in = new Scanner(System.in);
     String s = in.nextLine();
     String v= in.nextLine();
     String b = s+s;
     if(b.contains(v))
     {
       System.out.print("Yes");
     }else
     {
      System.out.print("No"); 
     }
      
      
    }
}