import java.util.Scanner;

class RotateMatrix {

    static void Rotatematrix(int[][] matrix , int n ){
         findTranspose(matrix , n ,n);
         // reverse of array ;
         for(int i = 0 ; i<n ; i++){
            reverseArray(matrix[i]);
         }
         
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static void findTranspose(int[][] matrix , int r , int c) {
        for(int i = 0 ; i<r ; i++){
            for(int j = i ; j<c ; j++){
              int temp = matrix[i][j] ;
              matrix[i][j] = matrix[j][i] ;
              matrix[j][i] = temp ;
            }
        }
    }
    static void reverseArray(int[] arr){
        int j = arr.length -1 ;
        int i = 0 ;
        while(i<j){
            int temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;
            i++ ;
            j-- ;
        }
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column of matrix :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter matrix elements : ");
        int[][] matrix = new int[r][c] ;
        for(int i = 0 ; i<r ; i++){
            for(int j = 0 ; j<c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Rotate 90 degree a matrix :");
            Rotatematrix(matrix,c);

    
    }
}
