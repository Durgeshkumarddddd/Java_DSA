
 class ReverseString {
    public static String reverse(String str){ 
        int i = 0 ; 
        int j = str.length() - 1;
        StringBuilder res = new StringBuilder(str);
        while(i < j)
        {
            char temp = res.charAt(i);
            res.setCharAt(i, res.charAt(j));    
            res.setCharAt(j, temp);

            
        }
        return res.toString();
    }
    public static void main(String[] args){
        String str = "Hello";
        String reversed = reverse(str);
        System.out.println("Reversed string: " + reversed);
    }
    
}
