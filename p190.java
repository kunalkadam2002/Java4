class p190{
    public static void main(String args[]){
      int a,b,c,d;
      for(a=4;a>=1;a--){
           for(b=a;b<=4;b++){
	System.out.print("-");
           }
           for(c=1;c<=a;c++){
	System.out.print("*");
          }
          for(d=a-1;d>0;d--){
	System.out.print("*");
         }
       System.out.print("\n");
 
    }
   }

}