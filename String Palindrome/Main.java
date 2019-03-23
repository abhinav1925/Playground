import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int ln = s.length();
        StringBuilder temp = new StringBuilder();
        for(int i=ln-1;i>=0;i--)
        {
          temp.append(s.charAt(i));
          
        }
        String t=temp.toString();
      if(t.equals(s))
      {
        System.out.println("Yes");
      }else
      {
        System.out.print("No");
      }
    } 
}