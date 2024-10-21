import java.util.Scanner;

class SpiralMatrix {

    static void printSpiralMatrix(int[][] arr , int r , int c){
        int leftcolumn = 0 ;
        int rightcolumn = arr.length - 1 ;
        int toprow = 0 ; 
        int brow = r ;
        int totalelement = 0 ;
        
        while(totalelement < r*c){
            for(int j = leftcolumn ; j<rightcolumn && totalelement<r*c ; j++){
              System.out.print(arr[toprow][j]+"  ");;
              totalelement++ ;
            }
            toprow++ ; 
            for(int i = toprow; i<brow  &&  totalelement<r*c ; i++){
                System.out.print(arr[i][rightcolumn]);
                totalelement++ ;
            }
            rightcolumn-- ; 
            for(int j = rightcolumn ; j < leftcolumn && totalelement<r*c ; j++){
                System.out.print(arr[brow][j]);
                totalelement++ ;
            }brow-- ;
            for(int i = brow ; i < toprow && totalelement<r*c ; i++){
                System.out.print(arr[i][leftcolumn]);
                totalelement++ ;
            }
            brow-- ;
        }
      
       

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array row and column size: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[][] = new int[r][c];
        for(int i = 0 ; i<r ; i++){
            for(int j = 0 ; j<c ; j++){
                arr[i][j] = sc.nextInt();
            }
           
        }
        System.out.println("Printing the Spiral matrix");
        printSpiralMatrix(arr , r , c);

    }
}
