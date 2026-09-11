class Solution {
     public List<List<String>> groupAnagrams(String[] strs) {
        List<String> strings = Arrays.asList(strs);

        Map<String, List<String>> anagrams = new HashMap<>();
        for (String s : strings) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            anagrams.computeIfAbsent(new String(chars), k -> new ArrayList<>()).add(s);
        }

        List<List<String>> result = new ArrayList<>(anagrams.values());
        return result;
    }
}

