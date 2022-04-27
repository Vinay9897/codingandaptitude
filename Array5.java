public class Array5 {
    //Count Special Quadruplets
    public int countQuadruplets(int[] nums) {
        int count = 0;
        int startIndex = 0;
        int endIndex = nums.length -1;
        int leftSum = 0;
        int rightSum=0;
        for(int i=0;i<nums.length;i++){
            if(leftSum > rightSum){
                rightSum = nums[endIndex--];
            }
            else{
                leftSum += nums[startIndex++];
            }
            if(leftSum == rightSum){
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Array5 ar5 =new Array5();
        int[] arr = {1,1,1,3,5};
        System.out.println(ar5.countQuadruplets(arr));
    }
}
