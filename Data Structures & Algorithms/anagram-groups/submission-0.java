class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = Arrays.asList(strs)
                                      .stream()
                                      .collect(Collectors.groupingBy(x -> {
                                          char[] ch = x.toCharArray();
                                          Arrays.sort(ch);
                                          return new String(ch);
                                      }))
                                      .values()
                                      .stream()
                                      .collect(Collectors.toList());
        
        return list;
    }
}
