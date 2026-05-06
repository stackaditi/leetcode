import java.util.*;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int count = 0;
        int currentEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (nextStart < currentEnd) {
                count++;
                currentEnd = Math.min(currentEnd, nextEnd);
            } else {
                currentEnd = nextEnd;
            }
        }

        return count;
    }
}