import java.util.*;
class p225{
  public static void main(String args[]){
    int i,j,per;
    int tot=0;
    
    int a[]=new int[6];
    Scanner d1=new Scanner(System.in);
    System.out.print("enter marks of  6 sub :") ;
    for(i=0;i<a.length;i++){
      a[i]=d1.nextInt();
    }
    for(i=0;i<a.length;i++){
      tot=tot+a[i];
   }
   per=tot/6;
   System.out.print(per);
   if(per>=50)
      System.out.print("pass");
   else if(per>=75)  
      System.out.print("first class");
   else 
       System.out.print("fail");
   

  }
}