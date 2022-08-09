import java.util.*;
class p206{
  public static void main(String args[]){
    int i,j;
    int a[]=new int[5];
    Scanner d1=new Scanner(System.in);
    System.out.print("enter array elements :");
    for(i=0;i<a.length;i++){
      a[i]=d1.nextInt();
   }
 
   for(i=0;i<a.length;i++){
     if(a[i]%2!=0){
       System.out.print(" "+a[i]);
     }
  }

  }
}