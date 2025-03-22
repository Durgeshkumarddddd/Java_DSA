class sample{
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        int z = 30;

      //  By using ternary operator find highest value
        int max = (x > y && x > z)? x : (y > z)? y : z;
         max = x > y ? (x > z ? x : y) : (y > z ? y : z);
        System.out.println("Highest value is : " + max);
    }
}