

public class HollowRectangle {
    
    public static void main(String[] args){
        int n = 4 ;
        int m = 6 ;
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < m ; j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
}
