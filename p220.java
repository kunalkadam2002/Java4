import java.util.*;
class p220{
   public static void main(String args[]){
     int i,j,min;
     Scanner d1=new Scanner(System.in);
     int a[]=new int[5];
     for(i=0;i<a.length;i++){
        a[i]=d1.nextInt();
     }
     min=a[0];
     for(i=0;i<a.length;i++){
       if(a[i]<a[0]){
          min=a[i];
       }
     }
    System.out.print("minimum element is:"+min);
   }
}