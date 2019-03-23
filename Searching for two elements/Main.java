import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
      boolean a =true,b=true;
      int[] arr = new int[n];
      int val1=0,val2=0 ;
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
       }
      int s1 = in.nextInt();
      int s2 = in.nextInt();
      
      for(int i=0;i<n;i++)
      {
        if(arr[i]==s1)
        {
          a=true;
          val1=i;
          break;
      
        }else
        {
          a=false;
        }
   }
      
      
      for(int i=0;i<n;i++)
      {
            if(arr[i]==s2)
        {
          b=true;
          val2=i;
          break;

        }else
        {
          b=false;
        }
      }
      
      if(a)
      {
        System.out.println(val1);
       
      }else
      {
        System.out.println("-1");
      }
           
      if(b)
      {
        System.out.println(val2);
       
      }else
      {
        System.out.println("-1");
      }
      
    }
}