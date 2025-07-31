import java.util.*;
class New {
    static void pushAtBottom(Stack<Integer> s , int data){
        if (s.isEmpty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushAtBottom( s, data);
        s.push(top);
    }
    public static void main(String... args){
     Stack<Integer> s = new Stack<>();
     for (int i = 1 ; i <= 4 ; i++){
        s.push(i);
     }   
    System.out.println(s);   
     pushAtBottom(s, 5);
     System.out.println(s );
    }
}