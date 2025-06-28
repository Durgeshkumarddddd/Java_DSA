import java.util.ArrayList;
class ReverseList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = 5 ;
        for (int i = 0 ; i <  n ; i ++){
            list.add(i);
        }
        System.out.println(" Array List : ");
        for (int i = 0 ; i < n ; i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        System.out.println("Reverse List : ");
        for (int i = list.size()-1 ; i >= 0 ; i--){
            System.out.print(list.get(i));
        }
        int max = Integer.MAX_VALUE ;
        for (int i = 0 ; i < n ; i++){
            if (max < list.get(i)){
                max = list.get(i);

            }
        }
        System.out.println();
        System.out.println("Maximum is : "+max);
    }
}
