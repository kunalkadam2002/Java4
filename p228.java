import java.util.*;
class p228{
   public static void main(String args[]){
     int a[]=new int[5];
     int i,max;
     Scanner d1=new Scanner(System.in);
     for(i=0;i<a.length;i++){
      a[i]=d1.nextInt();
    }
    max=a[0];
    for(int x : a){
      if(x>max)
         max=x;
    }
    System.out.print("max element is :"+max);
  }
}