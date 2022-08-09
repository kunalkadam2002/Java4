import java.util.*;
class p217{
   public static void main(String args[]){
     int i,j;
     int a[]=new int[5];
     int b[]=new int[5];
     Scanner d1=new Scanner(System.in);
     for(i=0;i<a.length;i++){
      a[i]=d1.nextInt();
    }
    for(i=0;i<a.length;i++){
       b[i]=a[a.length-(i+1)];
    }
    for(i=0;i<a.length;i++){
       System.out.print(" "+b[i]);
    }
   }
}