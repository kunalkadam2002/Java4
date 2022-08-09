import java.util.*;
class p221{
   public static void main(String args[]){
    int i,j,n;
    int cnt=0;
    int a[]=new int[5];
    Scanner d1=new Scanner(System.in);
    for(i=0;i<a.length;i++){
      a[i]=d1.nextInt();
   }
   System.out.print("enter element to be searched :");
   n=d1.nextInt();
    for(i=0;i<a.length;i++){
      if(a[i]==n){
         cnt++;
         System.out.println("the element is present at position "+i); 
      }
    }
   if(cnt==0)
      System.out.println("the element is not present ");
   else 
       System.out.println("the element is present ");
  
  }
}