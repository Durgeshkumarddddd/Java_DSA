class noMoveEnd {
     static void moveno(int []arr){
        for( int i = 0; i < arr.length-1; i++){
            for( int j = 0 ; j < arr.length -i-1 ; j++){
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int []arr = {2,0,42,0,7};
        moveno(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
