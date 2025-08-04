import java.util.Stack;
class StockSpanProblem {

    public void stockSpan(int []stock, int []span){
        Stack<Integer> st = new Stack<>();
        span[0] = 1 ;
        
        for ( int i = 0 ; i < stock.length ; i++){
            int current = stock[i] ;

            while ( !st.isEmpty() && current > stock[st.peek()] ){
                st.pop();
            }

            if ( st.isEmpty()){
                span[i] = i + 1 ;
            }
            else {
                int prevHigh = st.peek();
                span[i] = i - prevHigh ;
            }
            st.push(i);
        }

    }
    
    public static void main( String args[]){
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);
        
        
    }
}

// ✅ Problem Statement:
// Given an array price[] of size n, where price[i] denotes the stock price on day i, find the stock span span[i] for each day. The span of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backward) for which the price of the stock was less than or equal to today's price.

// ✅ Example:
// Input: price[] = {100, 80, 60, 70, 60, 75, 85}
// Output: span[] = {1, 1, 1, 2, 1, 4, 6}

// ✅ Approach Using Stack (Efficient O(n)):
// We use a stack of indexes to keep track of elements where the span hasn’t been finalized ye
