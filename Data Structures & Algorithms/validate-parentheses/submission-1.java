
class Solution {
        public boolean isValid(String s) {
                // Quick check: odd length strings can never be balanced
                        if (s.length() % 2 != 0) return false; 
                                
                                        char[] stack = new char[s.length()];
                                                int head = 0;
                                                        
                                                                for (int i = 0; i < s.length(); i++) {
                                                                            char ch = s.charAt(i);
                                                                                        if (ch == '(' || ch == '{' || ch == '[') {
                                                                                                        stack[head++] = ch;
                                                                                                                    } else {
                                                                                                                                    if (head == 0) return false;
                                                                                                                                                    char top = stack[--head];
                                                                                                                                                                    if ((ch == ')' && top != '(') || 
                                                                                                                                                                                        (ch == '}' && top != '{') || 
                                                                                                                                                                                                            (ch == ']' && top != '[')) {
                                                                                                                                                                                                                                return false;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                            return head == 0;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                }
