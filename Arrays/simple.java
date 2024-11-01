import java.util.Scanner;
 class simple {
   static void  reverse(int[] arr, int i, int j){
     while(i<j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
     }
     
  }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array");
      int n = sc.nextInt();
      int []arr = new int[n];
      System.out.println("Enter array elements");
      for(int i= 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
  
    }
    System.out.println("Enter number rotate number");
    int k = sc.nextInt();
     k = k % n;
      reverse(arr, 1, k );
      reverse(arr,n-k, n);
     reverse(arr, 1, n);
     for(int i=1 ; i<arr.length ; i++){
     System.out.print(arr[i]); 
    }

  }
}
