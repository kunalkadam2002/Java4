import java.util.*;
class p226{
   public static void main(String args[]){
    int i,j,k;
    int cnt=0;
    int a[]=new int[5];
    Scanner d1=new Scanner(System.in);
    for(i=0;i<a.length;i++){
      a[i]=d1.nextInt();
    }
   
   for(i=0;i<a.length-cnt;i++){
       for(j=i+1;j<a.length;j++){
         if(a[i]==a[j]){
           cnt++;
           for(k=0;k<a.length-1;k++){
	a[k]=a[k+1];
           }
           a[k]=0;
         }
       }

    }
     for(i=0;i<a.length-cnt;i++){
         System.out.print(" "+a[i]);
     }
   }
}