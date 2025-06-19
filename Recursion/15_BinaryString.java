// print Binary String in a ways no cosucative 1 comes and print them.
// for ex : 0101001  not like : 011011
class BinaryString {
    static void printBinaryStr(int n , String last, String Str)
    {
    // Base Case 
    if (n == 0){
        System.out.println(Str);
        return ;
    }
    // if last occurance is 0 
    if (last == "0"){
    printBinaryStr( n - 1, "0", Str+"0");
    printBinaryStr(n - 1, "1", Str+"1");
    }else {
        printBinaryStr(n - 1, "0", Str+"0");
    }
   }

    
    public static void main(String args[]){
        int n = 3 ; 
        printBinaryStr(n, "0", "");
    }
}
