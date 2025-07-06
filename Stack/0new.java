import java.util.ArrayList;
class newCode {

    static class stack {
        static ArrayList<Integer> list = new ArrayList<>() ;
        
        boolean isEmpty(ArrayList<Integer> list)
        {
            return list.size() == 0 ;

        }

        void push(int data){
            list.add(data);
            System.out.println("push data is "+ data);
        }
        int pop (){
            if ( isEmpty(list)){
                System.out.println("Stack is empty");
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top; 

        }

        int  peak (){
             if ( isEmpty(list)){
                System.out.println("Stack is empty");
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String args[]){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

       System.out.println( s.pop());
       System.out.println( s.pop());


    }
}
