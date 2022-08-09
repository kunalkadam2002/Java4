import java.util.*;
class p216{
   public static void main(String args[]){
     int i,j;
     Scanner d1=new Scanner(System.in);
     int a[]=new int[5];
     int b[]=new int[5];
     for(i=0;i<a.length;i++){
       a[i]=d1.nextInt();
     }
    for(i=0;i<a.length;i++){
         b[i]=a[i];
    }
    for(i=0;i<a.length;i++){
         System.out.print(" "+b[i]);
     }
   }
}