import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int temp;
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
       }
     int k = in.nextInt(); 
      
      for(int i=0;i<n;i++)
      {
        for(int j =0;j<n;j++)
        {
          if(arr[i]>arr[j])
          {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
      
      }
      
      System.out.print(arr[k-1]);
    }   
}