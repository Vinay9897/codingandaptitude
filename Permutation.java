// public class Permutation{
// public static void main(String[] args){
// Permutation per = new Permutation();
// int[] nums={1,2,3};
// per.permute(nums);

// }

// public List<List<Integer>> permute(int[] nums){
// List<List<Integer>> res = new ArrayList<>();
// backtrack(res,nums,0);
// return result;
// }
// public void backtrack(List<List<Integer>> res, int[] nums, start){
// if(start == nums.length){
// result.add(toList(nums));
// }
// else {
// for(int i =start; i<nums.length; i++){
// swap(i,start,nums);
// backtrack(res,nums,start+1);
// swap(i,start,nums);
// }
// }
// }
// public void toList(int[] nums){
// List<Integer> res = new ArrayList<>();
// for(int i : nums) res.add(i);
// return res;
// }

// public void swap (int i, int j, int[] nums){
// int temp = nums[i];
// nums[i] = nums[j];
// nums[j] = temp;
// }
// }