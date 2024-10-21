import java.util.Scanner;

class matrixAdd {

    static void add(int[][] a , int r1 , int c1 , int[][] b , int r2 , int c2){
      
       if(r1 != r2 || c1 != c2){
        System.out.println("both table rows and table no. must be same ");
        return ;
       }
       int sum[][] = new int[r1][c1] ;
       for(int i = 0 ; i<r1 ; i++){
        for(int j = 0 ; j<c1 ; j++){
            sum[i][j] = a[i][j] + b[i][j] ;
        }
       }
       printmatrix(sum);

    }

    static void printmatrix(int[][] matrix ){
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
   
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println(" Enter rows and column number of 1 table : ");
      int r1 = sc.nextInt();
      int c1 = sc.nextInt();
      int a[][] = new int[r1][c1] ;
      System.out.println("Enter 1 matrix :");
      for(int i = 0 ; i<r1 ; i++){
        for(int j = 0 ; j<c1 ; j++){
            a[i][j] = sc.nextInt();
        }
      }
      System.out.println("Enter rows and column number of 2 tabel :");
      int r2 = sc.nextInt();
      int c2 = sc.nextInt();
      System.out.println("Enter 2 matrix :");
      int b[][] = new int[r2][c2] ;
      for(int i = 0 ; i<r2 ; i++){
        for(int j = 0 ; j<c2 ; j++){
            b[i][j] = sc.nextInt();
        }
      } 
      System.out.println("First Matrix");
      printmatrix(a);
      System.out.println("Second Matrix");
      printmatrix(b);
      System.out.println("Addition of two table is : ");
      add(a, r1, c1, b, r2, c2);

    }
}
