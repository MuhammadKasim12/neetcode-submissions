class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] alphaArray= new int[26];
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            alphaArray[index]+=1;
            index=t.charAt(i)-'a';
            alphaArray[index]-=1;
        }
        for(int i=0;i<26;i++){
            if(alphaArray[i]!=0){
                return false;
            }
        }
        System.out.println("before print");
        System.out.println(Arrays.stream(alphaArray).boxed().collect(Collectors.toList()));
        System.out.println("after print");
        return true;
    }

}
