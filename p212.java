import java.util.*;
class p212{
   public static void main(String args[]){
     int i,j;
     int a[]=new int[5];
     Scanner d1=new Scanner(System.in);
     for(i=0;i<a.length;i++){
       a[i]=d1.nextInt();
    }
      j=a[0];
    for(i=0;i<a.length-1;i++){
       a[i]=a[i+1];
   }
   a[i]=j;
   for(i=0;i<a.length;i++){
       System.out.print(" "+a[i]);
    }
   
   

    
   }
}