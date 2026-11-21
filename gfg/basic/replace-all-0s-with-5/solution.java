class Solution {
	public static int rev(int n) {
		int rev = 0;
		while (n > 0) {
			int rem = n%10;
			if (rem == 0)
				rem += 5;
			rev = rev*10 + rem;
			n = n/10;
		}
		return rev;
	}
	public int convertFive(int n) {
		// code here
		if (n == 0)
			return 5;
		int revNum = rev(n);
		if (revNum == n)
			return n;
		return rev(revNum);
		
// 		String result = String.valueOf(n).replace('0', '5');
//         return Integer.parseInt(result);
	}
}
