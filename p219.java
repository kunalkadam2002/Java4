import java.util.*;
class p219{
  public static void main(String args[]){
    int i,j,max;
    int a[]=new int[5];
    Scanner d1=new Scanner(System.in);
    for(i=0;i<a.length;i++){
      a[i]=d1.nextInt();
    }
    max=a[0];
    for(i=0;i<a.length;i++){
        if(a[i]>a[0]){
           max=a[i];
       }
    }
    System.out.print("max no is :"+max);
  }
}