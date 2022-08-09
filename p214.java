import java.util.*;
class p214{
   public static void main(String args[]){
     int i,j;
     Scanner d1=new Scanner(System.in);
     int a[]=new int[5];
     for(i=0;i<a.length;i++){
       a[i]=d1.nextInt();
    }
    j=a[a.length-1]+a[0];
    for(i=a.length-1;i>0;i--){
      a[i]=a[i]+a[i-1];
   }
   a[i]=j;
    for(i=0;i<a.length;i++){
       System.out.print(" "+a[i]);
    }
 

   }
}