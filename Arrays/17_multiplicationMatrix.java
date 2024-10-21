import java.util.Scanner;

class multiplicationMatrix {

   static void multiOfmatrix(int a[][] , int r1 ,int c1 ,int[][] b ,int r2 ,int c2){
    if(c1 != r2 ){
        System.out.println(" Wrong input ! 1 matrix column and 2 matrix row must be same");
        return ;
    }
    
    int[][] mul = new int[r1][c2] ;
     
     for(int i = 0 ; i<r1 ; i++){
        for(int j = 0; j<c2 ; j++){

            for(int k = 0 ; k <c1 ; k++ ){
                mul[i][j] += a[i][k] * b[k][j] ;
            }
        }
     }
       printmatrix(mul) ;
   }

     static void printmatrix(int[][] arr){
       for(int i = 0 ; i<arr.length ; i++){
        for(int j = 0 ; j<arr[i].length ; j++){
            System.out.print(arr[i][j]+"  ");
        }
        System.out.println();
       }
     }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of row and column of table 1 ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter matrix element :");
        int a[][] = new int[r1][c1] ;
        for(int i = 0 ; i<r1 ; i++){
            for(int j = 0 ; j<c1 ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter no. of row and column of table 2 :");
        int r2 = sc.nextInt() ;
        int c2 = sc.nextInt();
        System.out.println("Enter elements of matrix 2");
        int b[][] = new int[r2][c2];
        for(int i = 0 ; i<r2 ; i++){
            for(int j = 0 ; j<c2 ; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("multiplication of two matrix :");
        multiOfmatrix(a, r1, c1, b, r2, c2);
    }
}
