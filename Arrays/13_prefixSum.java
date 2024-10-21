import java.util.Scanner;
class prefixSumFind {
    static int[] findPrefixsum(int[] arr){
        int n = arr.length ;
        int[] pre = new int[n];
        pre[0] = arr[0] ;
        for(int i = 1 ; i<n ; i++){
            pre[i] = pre[i-1] + arr[i];
        }
        return pre ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int []pre = findPrefixsum(arr);
        System.out.println("Prefix sum :");
        for(int i = 0 ; i<n ; i++){
            System.out.print(pre[i] + "  ");
        }System.out.println();
        
        System.out.println("Enter no of Query :");
         int q = sc.nextInt();
         while(q-- > 0){
            System.out.println("Enter range to find sum :");
            int s = sc.nextInt();
            int l = sc.nextInt();
          System.out.println("Sum of prefix range"+s+"to"+l);
          int prefix = pre[l]-pre[s-1];
          System.out.println(prefix +"  ");

         }

    }
}
