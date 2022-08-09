import java.util.*;
class p210{
   public static void main(String args[]){
     int a[]=new int[6];
     int tot,i;
     float per;
     Scanner d1=new Scanner(System.in);
     for(i=0;i<a.length;i++){
       a[i]=d1.nextInt();
     }
  
   for(i=0,tot=0;i<a.length;i++){
         tot=tot+a[i];
     }
    System.out.println("total is :"+tot);
    per=tot/6;
    System.out.println("percentage is :"+per);
   }
}