import java.util.ArrayList;
class multiDimension {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
         list.add(5);
         list.add(6);
        ArrayList<Integer> list2 = new ArrayList<>();
         list2.add(3);
         list2.add(1);
         ArrayList<Integer> list3 = new ArrayList<>();
         list3.add(8);
         list3.add(9);
         mainlist.add(list);
         mainlist.add(list2);
         mainlist.add(list3);

         for (int i = 0 ; i < mainlist.size() ; i++){
            ArrayList getlist = mainlist.get(i);
            System.out.print(getlist);
            for ( int j = 0 ; j < getlist.size() ; j++){
                System.out.print(getlist.get(j)+" ");
            }
            System.out.println();
         }

         System.out.println(mainlist);
    }
}
