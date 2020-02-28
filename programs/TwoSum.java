public class TwoSum{
	public static void main(String[] args){
		int[] a = {2,7,11,15};
		System.out.println(twoSum(a,9));
	}
	public Static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < nums.length ; i++) {
			map.put(nums[i], i);
		}
		for(int i = 0 ; i < nums.length ; i++) {
			int remaining = target - nums[i];
			if(map.containsKey(remaining) && i != map.get(remaining)) {
				return new int[] {i,map.get(remaining)};
			}
		}
		throw new IllegalArgumentException("no result") ;
	}
}