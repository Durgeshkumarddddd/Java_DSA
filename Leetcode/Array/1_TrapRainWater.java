

class TrapingRainWater {
    public static int findTrapWater(int []height){
        //1. find left max boundary
        //2. find Right max boundary
        //3. water level = min(leftmax, rightmax)
        //4. trap water = waterlevel - height[i]
        int n = height.length ;
        int []leftmax = new int[height.length];
        int []rightmax = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1 ; i < height.length ; i++){
           if (leftmax[i-1] > height[i]){
              leftmax[i] = leftmax[i-1];
           }
           else {
            leftmax[i] = height[i];
           }
        }
        // for (int i = 0 ; i < n ; i++){
        //     System.out.print(leftmax[i]);
        // }
        // For Right max 
        rightmax[n - 1 ] = height[n - 1];
        for (int i = n-2 ; i >= 0 ; i--){
            if (rightmax[i+1] > height[i]  ){
                rightmax[i] = rightmax[i+1];
            }
            else {
                rightmax[i] = height[i];
            }
        }
        
        // 3 find trap water 

        int waterlevel = 0 ; 
        int waterTrap = 0 ;

        for (int i = 0 ; i < n  ; i++){
            waterlevel = Integer.min(leftmax[i], rightmax[i]);
            waterTrap += waterlevel - height[i];
        }
       return waterTrap ;
    }
   public static void main(String args[]){
    int height[] = {4,2,0,6,3,2,5};
    int trapwater =  findTrapWater(height);
    System.out.println(trapwater);
   } 
}
