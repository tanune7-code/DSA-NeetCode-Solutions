class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            // handle potential nulls defensively
            if (s == null) s = ""; 
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    // Changed 'str' to 's' here to match your internal code
    public List<String> decode(String s) { 
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            // find the delimiter '#'
            while (j < s.length() && s.charAt(j) != '#') {
                j++;
            }
            
            // length of the next string
            int length = Integer.parseInt(s.substring(i, j));
            
            // move past the delimiter
            i = j + 1;
            
            // extract the string of the given length
            String value = s.substring(i, i + length);
            res.add(value);
            
            // move to the next encoded string
            i += length;
        }
        return res;
    }
}
