package OOPS;

 class functionOverloading {
    public static int add(int x, int y){
        int sum = x + y;
        return sum;
    }
    public static float add(float x, float y){
        float sum = x + y;
        return sum;
    }
    public static int add(int x , int y , int z){
        return x+y+z;

    }
    public static void main(String[] args){
       System.out.println( add(23, 45)) ;
       System.out.println(add(2.4f, 5.5f));
       System.out.println(add(2,3,6));
    }
}
