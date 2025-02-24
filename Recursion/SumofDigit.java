class SumofDigit{
    public static int sumOfDigits(int num){
        if(num == 0){
            return 0;
        }
        return (num%10)+ sumOfDigits(num/10);
    }

    public static void main(String[] args){
        int num = 123;
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits of " + num + " is: " + sum);
    }
}