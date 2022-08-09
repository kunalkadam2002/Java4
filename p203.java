import java.util.*;
class p203{
   public static void main(String args[]){
      int a[],i;
      a=new int[5];
      Scanner d1=new Scanner(System.in);
      System.out.print("enter array elements :");
         for(i=0;i<a.length;i++){
                 a[i]=d1.nextInt();
         }  
      System.out.print(" array elements are :");
         for(i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
  
   }

}