import java.util.*;
class p204{
   public static void main(String args[]){
     int i;
     int a[]=new int[5];
     Scanner d1=new Scanner(System.in);
    
    for(i=0;i<a.length;i++){
          a[i]=d1.nextInt();
    }
   System.out.print("even elements are :");
     for(i=0;i<a.length;i++){
         if(a[i]%2==0){
           System.out.print(" "+a[i]);
        }
     }
   }

}