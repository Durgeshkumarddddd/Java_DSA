//  Given an integer n with array nums of length n+1 
//  and nums[0]= 0 , nums[1] = 1, nums[2*i] = nums[i], nums[2*i+1] = nums[i]+nums[i+1];
//  write code to implement this and find out the maximum no. in this array. 
//  for ex: n = 7 ;
//          max = 3 ;
//     index : 0, 1, 2, 3, 4, 5, 6, 7
//     nums = [0, 1, 1, 2, 1, 3, 2, 3]; here max no = 3 ;



 class Findmax{
    public static void main(String args[]){
        
        int n = 7 ;
        int[] nums = new int[n];
         nums[0] = 0; 
         nums[1] = 1 ;
         int maximum = 0 ;

         for(int i = 2 ; i < n ; i++){
            if(i % 2 == 0){
                nums[i] = nums[i/2];
            }
            else {
                nums[i] = nums[i/2] + nums[i/2 +1] ;
            }
            maximum = Integer.max(maximum,nums[i]);
         }
         System.out.println(maximum);
    }
}
