class p201{
   public static void main(String args[]){
     int a,b,c,d;
     for(a=1;a<=5;a++){
       for(b=5;b>=a;b++){
	System.out.print(" ");
       }
       for(c=a;c>=1;c--){
	if(a==c){
	  System.out.print("1");
	}
	else{
	  System.out.print("0");
	}
      }
      
   }
  }
}