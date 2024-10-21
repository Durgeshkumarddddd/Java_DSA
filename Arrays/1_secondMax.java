import java.util.Scanner;
 class secondMax {
    public static int maximumNo(int[] arr){
        int mx = Integer.MIN_VALUE ;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>mx){
                mx = arr[i] ;
            }}
        return mx ;
    }
  public static int secondLargest(int[] arr){
     int mx = maximumNo(arr);
     for(int i = 0 ; i < arr.length ; i++){
        if(arr[i]==mx){
            arr[i] = Integer.MIN_VALUE ;
        }
     }
     int secondMx = maximumNo(arr);
     return secondMx ;
  }

    public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    System.out.println("Enter "+n + "Elements");
    int arr[] = new int[n];
    for(int i = 0 ; i<n ; i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("The second Largest element : "+secondLargest(arr));
    }
}
