class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            while (!stack.isEmpty() && temp[stack.peek()] < temp[i]) {
                int prevIndex = stack.pop();
                res[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return res;
    }
}
