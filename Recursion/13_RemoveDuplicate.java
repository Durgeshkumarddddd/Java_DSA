class RemoveDuplicate {
  
    public static void removeDuplicate(String Str, StringBuilder newStr, int idx,boolean []map){
        // Base Case if idx == str.length print string and return ;
       // 
       if (idx == Str.length()  ){
          System.out.println(newStr);
          return ;
       }
       // 2. find index by type conversion string to int 
       char currStr = Str.charAt(idx) ;
       // 3. compare the map[index]
       if (map[currStr - 'a'] == true ){
        removeDuplicate(Str, newStr, idx + 1, map);
       }
       else {
        map[currStr - 'a'] = true ;
        removeDuplicate(Str, newStr.append(currStr), idx + 1, map);
       }

    }
    public static void main(String args[]){
     String Str = "appnnacollege";
     boolean []map = new boolean[26];
     removeDuplicate(Str,new StringBuilder(),0,map);        
    }
}
