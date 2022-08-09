import java.util.*;
class p207{
  public static void main(String args[]){
     int i,j,sum;
     Scanner d1=new Scanner(System.in);
     int a[]=new int[5];
     for(i=0;i<a.length;i++){	
        a[i]=d1.nextInt();
     }
    for(i=0,sum=0;i<a.length;i++){
       if(a[i]%2==0){
          sum=sum+a[i];
       }
   }
    System.out.print(" "+sum); 

     
   }
}