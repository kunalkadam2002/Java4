import java.util.*;
class p222{
  public static void main(String args[]){
    int i,j,n;
    int cnt=0;
    Scanner d1=new Scanner(System.in);
    int a[]=new int[5];
    for(i=0;i<a.length;i++){
       a[i]=d1.nextInt();
    }
     System.out.print("enter element to be searched :");
     n=d1.nextInt();
    for(i=0;i<a.length;i++){
        if(a[i]==n)
           cnt++;
    }
    System.out.print("the element is present "+cnt+" times");
  }
}