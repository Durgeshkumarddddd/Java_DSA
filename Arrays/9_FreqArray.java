 import java.util.Scanner ;
 class FreqArray {
    static int[] makeFrequencyArray(int[] arr){
        int freq[] = new int[100005] ;
        for(int i = 0 ; i<arr.length ; i++){
            freq[arr[i]]++ ;
        }
        return freq ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array element :");
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int[] freq = makeFrequencyArray(arr);
        System.out.println("Enter size of Query :");
        int q = sc.nextInt();
         while(q > 0 ){
            System.out.print("Enter Query No :");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("Not present");
            }
            q--;
         }
    }
}
