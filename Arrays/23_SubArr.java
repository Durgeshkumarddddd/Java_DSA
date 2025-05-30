class SubArr {
    public static void main(String args[]){
        int []arr = {2,3,5,6,8,9};
        int n = arr.length ;
        for (int i = 0 ; i < n ; i++){
            int start = i ;
            for (int j = start  ; j < n ; j++){
                 int end = j ; 
                 System.out.print("(");
                 for (int k = start ; k <= end ; k++){

                    System.out.print(+arr[k]+" ");
                 }
                 System.out.print(")");
            }
            System.out.println();
        }
    }
}
