class p193{
   public static void main(String args[]){
     int a,b,c;
    for(a=5;a>=1;a--){
       for(b=a;b<=5;b++){
	System.out.print(" ");
       }
       for(b=1;b<=a;b++){
	System.out.print(b+" ");
      }
      for(c=a-1;c>=1;c--){
	System.out.print(c+" ");
     }
     System.out.print("\n");

   }
  }

}