// Give the unRepeatable number if all numbers are repeatable two times.

class Bit {
    static int findUnrepeatable(int []arr){
        int n = arr.length;
        int res = 0;
        for(int i = 0 ; i < n ; i++){
            res = res^arr[i];
        }
        return res;  // This will give the unrepeatable number if all numbers are repeatable two times.  // 15 will be the output for given array.  // 15 = 1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 + 7^2 + 8^2 + 9^2 + 10^2 + 11^2 + 1
    }

 public static void main(String[] args){
    int arr[] = {1, 2, 3,8,2,1,3,4};
    int res = findUnrepeatable(arr);
    System.out.println(res);
 }    
}
