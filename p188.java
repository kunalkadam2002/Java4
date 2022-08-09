class p188{
     public static void main(String args[]){
       int a,b,c;
       for(a=1;a<=5;a++){
            for(b=a;b<=5;b++){
	System.out.print(" ");
            } 				//for upper triangle
           for(c=1;c<=a;c++){
	System.out.print("* ");
           }
          System.out.print("\n");
      }


      for(a=4;a>=1;a--){
           for(b=a;b<=5;b++){
	System.out.print(" ");
           }				//for lower triangle
           for(c=1;c<=a;c++){
	System.out.print("* ");
          }
         System.out.print("\n");

      }
      
   
    }

}