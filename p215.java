import java.util.*;
class p215{
  public static void main(String args[]){
    int i,j,k;
    int a[]=new int[6];
    Scanner d1=new Scanner(System.in);
     for(i=0;i<a.length;i++){
      a[i]=d1.nextInt();
     }
    for(i=0;i<a.length;i+=2){
          k=a[i];
          a[i]=a[i+1];
          a[i+1]=k;
    }
    for(i=0;i<a.length;i++){
      System.out.print(" "+a[i]);
     }
  }
}