class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        substrmap={}
        l=0
        res=0

        for r in range(len(s)):
            if s[r] in substrmap:
                l=max(substrmap[s[r]]+1, l)
            substrmap[s[r]]=r
            res=max(res,r-l+1)
        return res