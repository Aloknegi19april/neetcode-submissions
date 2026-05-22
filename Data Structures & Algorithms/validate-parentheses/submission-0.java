class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] ch = s.toCharArray();
        for(Character c : ch){
            if(!stack.isEmpty() && (
            (stack.peek() == '[' && c == ']') ||
            (stack.peek() == '{' && c == '}') ||
            (stack.peek() == '(' && c == ')'))){
                stack.pop();
            } else {
                stack.push(c);
            }
        } 
        return stack.isEmpty();
    }
}
