class Solution {
	public int findDiff(int[] arr) {
		// code here
		Map<Integer, Integer> freq = new HashMap<>();
		int lowest = Integer.MAX_VALUE;
		int highest = Integer.MIN_VALUE;
		
		for (int num : arr) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}
		
		for (int num : arr) {
			lowest = Math.min(lowest, freq.get(num));
			highest = Math.max(highest, freq.get(num));
		}
		return highest - lowest;
	}
}
