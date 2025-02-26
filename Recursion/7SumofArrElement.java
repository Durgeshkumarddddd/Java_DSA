class findSum {

    static int findSum(int []arr, int idx){
        if(idx == arr.length ) return 0;
          
        // Smalll part of solution
        int ele = findSum(arr, idx +1);

        // Self work is 
        int sum = arr[idx] + ele ;
        return sum;

    }
    public static void main(String[] args){
        int []arr = {2,3,4,5,6};
        int sum = findSum(arr, 0);
        System.out.println("Sum of all elements in the array is: " + sum);
    }
}
