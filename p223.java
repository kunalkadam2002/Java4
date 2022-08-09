import java.util.*;
class p223{
  public static void main(String args[]){
    int i,j,k;
    Scanner d1=new Scanner(System.in);
    int a[]=new int[5];
    for(i=0;i<a.length;i++){
     a[i]=d1.nextInt();
    }
    for(i=0;i<a.length;i++){
       for(j=i+1;j<a.length;j++){
          if(a[i]>a[j]){
	k=a[i];
	a[i]=a[j];
	a[j]=k;
           }
       }
    }
    for(i=0;i<a.length;i++){
       System.out.print(" "+a[i]);
    }
    
  }
}