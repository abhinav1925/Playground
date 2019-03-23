import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int s=0;
      int n = in.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
      }
      
       for(int i=0;i<n;i++){
        if(arr[i]>s)
        {
          s=arr[i];
        }
         
      }
      System.out.println(s);
      
      

    }
}