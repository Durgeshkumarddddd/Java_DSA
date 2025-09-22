class StaticVariable {

    static int count = 0;
        public static void fun() {
            count++;
            System.out.println(count);
        }
     public static void main(String args[]) {
         fun();
         fun();
         fun();
     }
}
