class Solution:

    def encode(self, strs: List[str]) -> str:
        string=""
        for s in strs:
            string+=str(len(s))+"#"+s
        return string

    def decode(self, s: str) -> List[str]:
        res=[]
        i=0
        while i<len(s):
            delimiter=s.find("#",i)
            length=int(s[i:delimiter])
            i=delimiter+length+1
            res.append(s[delimiter+1:i])
        return res