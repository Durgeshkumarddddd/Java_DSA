import java.util.*;
class New {
    static void pushAtBottom(Stack<Integer> s , int data){
        if (s.isEmpty()){
           s.push(data);
           return ;
        }

        int top =  s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args){
       Stack<Integer> s = new Stack<>();
       System.out.println(s);
       int n = 4;
       for (int i = 0 ; i < n ; i++){
        s.push(i);
       }
       while (!s.isEmpty()){
        System.out.print(s.peek());
        s.pop();
       }

    }
}