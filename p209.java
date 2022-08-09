import java.util.*;
class p209{
   public static void main(String args[]){
     int a[]=new int[5];
     int i,sum;
    Scanner d1=new Scanner(System.in);
    for(i=0;i<a.length;i++){
       a[i]=d1.nextInt();
    }

   for(i=0,sum=0;i<a.length;i++){
     if(a[i]%2!=0){
      sum=a[i]+sum;
     }
   }
   System.out.print("sum of odd elements is :"+sum);
  }
}