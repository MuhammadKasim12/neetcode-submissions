class Solution {

    public String encode(List<String> strs) {
        //1. Iterate through the list of strings
        //2. For each string, add its length and the string itself to the result string
        //3. Add a delimiter to the result string
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('/').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int delimeterIndex=str.indexOf("/",i);
            int length = Integer.parseInt(str.substring(i, delimeterIndex));
            i=delimeterIndex+1+length;
            String decodedString = str.substring(delimeterIndex + 1, i);
            result.add(decodedString);
        }
        return result;
    }
}
