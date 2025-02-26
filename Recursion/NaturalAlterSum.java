 class NaturalAlterSum {
    static int naturalAlterSum(int num,int sum){
        if(num == 0){
            return 0;
        }
        if( num % 2 ==0)
        return num - naturalAlterSum(num-1,sum);
        else return num + naturalAlterSum(num-1,sum);
      
    }

    public static void main(String[] args){
        int num = 10;
        int sum = 0;
        int result = naturalAlterSum(num,sum);
        System.out.println("Sum of natural numbers from 1 to " + num + " is: " + result);
    }
}
