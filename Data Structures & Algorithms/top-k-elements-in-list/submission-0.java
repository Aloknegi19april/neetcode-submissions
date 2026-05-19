class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        return Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(x -> x))
            .entrySet()
            .stream()
            .sorted(Map.Entry
                    .<Integer, List<Integer>>comparingByValue(Comparator.comparingInt(List::size))
                    .reversed())
            .limit(k)
            .mapToInt(Map.Entry::getKey)
            .toArray();
    }
}
