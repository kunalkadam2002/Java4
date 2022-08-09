import java.util.*;
class p205{
   public static void main(String args[]){
    int i,j,sum;
    int a[]=new int[5];
    Scanner d1=new Scanner(System.in);
     for(i=0;i<a.length;i++){
       a[i]=d1.nextInt();  
   }
 
   for(i=0,sum=0;i<a.length;i++){
     sum=sum+a[i];
   }
   System.out.print(" "+sum); 
 }
}