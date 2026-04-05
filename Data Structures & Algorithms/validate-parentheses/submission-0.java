class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {

            // 1. Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else {
                
                // 2. If stack is empty but we have a closing bracket, it's invalid
                if (stack.isEmpty()) return false;
                
                // 3. Pop the top (opening) bracket and compare to current (closing) bracket
                char top = stack.pop();
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // 4. If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}
