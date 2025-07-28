import java.util.Stack;
class ReverseStack {
    public static void printStack(Stack<Integer> s){
      
        while (!s.isEmpty()){
        System.out.print(s.pop());
       }

    }
    public static void pushAtBottom(Stack<Integer> st, int data){
        if (st.isEmpty()){
            st.push(data);
            return ;
        }
        int top = st.pop();
        pushAtBottom(st, data);
        st.push(top);
    }
    public static void reverseStack(Stack<Integer> st ){
        if (st.isEmpty()){
            return ;
        }
        
       int top =  st.pop();
       reverseStack(st);
       pushAtBottom(st, top);

    }

    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        for (int i =0 ; i < 4 ; i++){
            s.push(i); 
        }
        printStack(s);
        reverseStack(s );
        printStack( s );
    }
}
