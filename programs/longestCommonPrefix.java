/*
	Write a function to find the longest common prefix string amongst an array of strings.
*/

class Solution {
    	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}

		char[] baseWord = strs[0].toCharArray();
		int longestCommon = baseWord.length;
		for (int i = 1; i < strs.length; ++i) {
			char[] compareWord = strs[i].toCharArray();
			longestCommon = Math.min(longestCommon, compareWord.length);
			for (int cInd = 0; cInd < longestCommon; ++cInd) {
				if (baseWord[cInd] != compareWord[cInd]) {
					if (cInd == 0) {
						return "";
					}
					longestCommon = cInd;
				}
			}
		}
		return strs[0].substring(0, longestCommon);
    }
}