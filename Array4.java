public class Array4 {
    /*Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
*/
public static int findMiddleIndex(int[] nums) {
    int endIndex = nums.length - 1;
    int startIndex = 0;
    int leftSum = 0;
    int rightSum = 0;
    while (true) {
        if (leftSum > rightSum) {
            rightSum += nums[endIndex--];
        } else {
            leftSum += nums[startIndex++];
        }
        if (startIndex > endIndex) {
            if (leftSum == rightSum) {
                break;
                
            }
        }
    }
    return endIndex +1;
 
}
public static void main(String[] args) {
    int[] array = {3,7,5,8,6,6,3};
    int index = findMiddleIndex(array);
    System.out.println("Sum preceding the index " + index + " is equal to sum succeeding the index " + index);
    
}

}
