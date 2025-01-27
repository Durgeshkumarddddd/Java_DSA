 class newCode {
   public static void diamond(int n){
      for(int i = 1 ; i <= n ; i++){
         for(int j = n ; j > i ;j--){
            System.out.print(" ");
         }
         for(int j = 1 ; j <=i ; j++){
            System.out.print("*");
         }
         for(int j = 1 ; j < i ; j++){
            System.out.print("*");
         }
         System.out.println();
      }
      // Second part lowest part 
      for(int i = n ; i >= 1  ; i--){
         for(int j = n ; j > i ;j--){
            System.out.print(" ");
         }
         for(int j = 1 ; j <=i ; j++){
            System.out.print("*");
         }
         for(int j = 1 ; j < i ; j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
   public static void main(String[] args){
   diamond(5);
   }
}
