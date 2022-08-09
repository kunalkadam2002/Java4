class p195{
  public static void main(String args[]){
    int a,b,c,d;
     for(a=1;a<=5;a++){
         for(b=1;b<=a;b++){
	System.out.print(" ");
        }
      for(c=5;c>=a;c--){
	System.out.print(c);
     }
     for(d=a+1;d<=5;d++){
	System.out.print(d);
    }
  
    System.out.print("\n");   
    }
  }
}