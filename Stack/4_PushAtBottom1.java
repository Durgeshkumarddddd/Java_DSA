import java.util.*;
class PushAtBottomR {


    public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    System.out.println(st);
    Stack<Integer> s = new Stack<>();
    while ( st.size() > 0 ){
       int result =  st.pop();
       s.push(result);
    }
    System.out.println("enter no to be push at bottom :");
    Scanner sc = new Scanner ( System.in);
    int x = sc.nextInt();
    st.push(x);
    while ( s.size() > 0 ){
        st.push(s.pop());
    }

    System.out.println(st);
}
}
