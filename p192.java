class p192{
   public static void main(String args[]){
     int a,b,c,d=1;
     for(a=1;a<=4;a++){
         for(b=a;b<=4;b++){
	System.out.print("-");
         }
        for(c=1;c<=a;c++){
             System.out.print(d+"-");
             d++;
        }
        System.out.print("\n");
    }

   }
}