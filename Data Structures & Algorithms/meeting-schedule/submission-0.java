/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) return true;
        
        // Step 1: Sort the intervals by their start time
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        
        // Step 2: Check for overlaps between adjacent meetings
        for (int i = 1; i < intervals.size(); i++) {
            Interval prev = intervals.get(i - 1);
            Interval curr = intervals.get(i);
            
            // If current meeting starts before the previous one ends, there is a conflict
            if (curr.start < prev.end) {
                return false;
            }
        }
        
        // No conflicts found
        return true;
    }
}
