class FindMax {

    public static int findMax(int []arr, int idx){
        // Base case
        if(idx == arr.length-1){
            return arr[idx];
        }

        // small problem --> idx+1 to end of array 
        int smallAns = findMax(arr,idx+1);
         
        // Self work and final answer
        return Math.max(arr[idx], smallAns);
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        
        int max = findMax(arr, 0);
        System.out.println("Maximum element in the array is: " + max);
    }
}
