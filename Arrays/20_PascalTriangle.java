import java.util.Scanner;

class PascalTriangle {

     static int[][] createPascalTriangle(int n ){
        int[][] matrix = new int[n][];
        for(int i = 0 ; i < n ; i++){
            matrix[i] = new int[i+1];
            matrix[i][0] = matrix[i][i] = 1 ; 
            for(int j = 1 ; j<i ; j++){
               
                matrix[i][j] = matrix[i-1][j] + matrix[i-1][j-1] ;
            }
        }
        return matrix ;
     }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows no. for pascal tree ");
        int n = sc.nextInt();
        int[][] PascalTriangle =  createPascalTriangle(n);
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<PascalTriangle[i].length ; j++){
                System.out.print(PascalTriangle[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
