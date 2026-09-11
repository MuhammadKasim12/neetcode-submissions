class Solution:
        def isAnagram(self, s: str, t: str) -> bool:
            if len(s)!=len(t):
                return False
            alphaArray=[0]*26

            for i in range(len(s)):
                index=ord(s[i])-ord('a')
                alphaArray[index]+=1
                index=ord(t[i])-ord('a')
                alphaArray[index]-=1

            for i in range(1,26):
                if alphaArray[i]!=0:
                    return False

            return True