class p229{
   public static void main(String args[]){
     int i,j;
     int a[][]={ 
                    {4,3,2,1,3},
                    {7,8,9,4,5},
                    {9,8,7,6,5}
                  };
     System.out.println("3x5 matrix is :");
     for(i=0;i<a.length;i++){
         for(j=0;j<a[i].length;j++){
           System.out.print(" "+a[i][j]);
          }
         System.out.print("\n");
      }
  }
}