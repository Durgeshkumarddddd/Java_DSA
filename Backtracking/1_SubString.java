
class  subString {
   public static void findSubString(String str, String ans, int i ){

    // Base Case
    if ( i == str.length()  ){
        if (ans.length() == 0 ){
            System.out.println("Null");
            return ;

        }
        else {
            System.out.println(ans);
            return ;
        }
    }
    // recursive call 
    findSubString(str, ans+str.charAt(i), i+1);
    findSubString(str, ans  , i + 1);
}
    public static void main(String args[]){
        String str = "abc";
        findSubString(str, "", 0);
    }
}
