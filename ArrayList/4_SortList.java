import java.util.ArrayList ;
import java.util.Collections;
import java.util.Scanner;
class SortList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
         int n = 5 ;
         System.out.println("Enter"+n+"numbers");
        for (int i = 0 ; i <  n ; i ++){
            int temp = sc.nextInt();
            list.add(temp);
        }
        Collections.sort(list);
        System.out.println("Ascending Order"+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order"+list);

    }
}
