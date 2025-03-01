 class LexicalSort {
    static void selectionSort(String[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            int minKey = i;
            for(int j = i ; j<n ; j++){
                if(arr[j].compareTo(arr[minKey])<0){
                    minKey = j;
                }
            }
            String temp = arr[minKey];
            arr[minKey] = arr[i];
            arr[i] = temp;

        }
    }
    
    public static void main(String[] args){
        String[] arr = {"zebra", "pig", "don","apple"};
        System.out.println("Original array: ");
        for(String s: arr){
            System.out.print(s + " ");
        }
        System.out.println("\nSorted array: ");
        selectionSort(arr);
        for(String s: arr){
            System.out.print(s + " ");
        }
    }
}
