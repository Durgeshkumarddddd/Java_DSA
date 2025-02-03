 import java.util.Scanner;

 class ArrSort {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of array:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("Original array:");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    for( int i = 0 ; i < n ; i++){
        for( int j = i+1 ; j < n ; j++){
            if(arr[i] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
    System.out.println("\nSorted array:");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
 }
}
