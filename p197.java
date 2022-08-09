class p197{
    public static void main(String args[]){
       int a,b,c,d;
        for(a=1;a<=5;a++){
	for(b=5;b>=a;b--){
	    System.out.print(" ");
	}
	for(c=1;c<=a;c++){
	    System.out.print(c);
	}
	for(d=a-1;d>0;d--){
	    System.out.print(d);
	}
	System.out.print("\n");
        }
    }
}