import java.util.Stack;
// we have to perform reverse of a String using Stack 

class Reverse {
  public static String reverseString(String str){
    int idx = 0 ;
    Stack<Character> s = new Stack<>();
    while (idx < str.length()){
      s.push(str.charAt(idx));
      idx++ ;
    }
    System.out.println(idx);
    StringBuilder newStr = new StringBuilder();
    while (!s.isEmpty()){
    newStr.append(s.peek());
      s.pop();
    }

    return newStr.toString() ;
  }
    public static void main(String args[]){
       String str = "abcd";
        
    
      String result =   reverseString(str);
      System.out.println(result);

    }
}
