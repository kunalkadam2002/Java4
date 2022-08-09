class p186{
   public static void main(String args[]){
     int a,b;
     for(a=5;a>=1;a--){
         for(b=a;b<=5;b++){
	System.out.print("-");
         }
         for(b=1;b<=a;b++){
	System.out.print("*");
         }
          System.out.print("\n");
     }
  }
}