import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
         Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int k = in.nextInt(); 
      int c =0;
       int arr[] = new int[n];
       int a[]=new int[k];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
       }
    for(int i=0;i<k;i++)
    {
      a[i]=i+1;
    }
     	for(int i=0;i<k;i++)
        {
          c=0;
         for(int j=0;j<n;j++) 
         {
           if(a[i]==arr[j])
           {
             c++;
           }
         }
          System.out.println(a[i]+" "+c);
        }
      
      
    }
}