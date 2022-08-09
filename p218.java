import java.util.*;
class p218{
   public static void main(String args[]){
    int i,j,k;
    int a[]=new int[5];
    Scanner d1=new Scanner(System.in);
    for(i=0;i<a.length;i++){
        a[i]=d1.nextInt();
    }
   for(i=0,j=a.length-1;i<a.length/2;i++,j--){
       k=a[i];
       a[i]=a[j];
       a[j]=k;
  }
 for(i=0;i<a.length;i++){
        System.out.print(" "+a[i]);
    }
  
 
   
  }
}