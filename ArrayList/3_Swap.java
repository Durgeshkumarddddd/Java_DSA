import java.util.ArrayList ;
class Swaptwono {
    public static void swaptwoNo(ArrayList<Integer> list , int idx1, int idx2){
       int temp = list.get(idx1);
       list.set(idx1, list.get(idx2));
       list.set(idx2, temp );

    }
    public static void printList(ArrayList<Integer> list){
        for (int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i));
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = 7 ;
        for (int i = 0 ; i <  n ; i ++){
            list.add(i);
        }
        System.out.println("We have to swap index 2 and 5");
        int idx1 = 2 ;
        int idx2 = 5;

        swaptwoNo(list, idx1, idx2);
        printList(list);
    }
}
