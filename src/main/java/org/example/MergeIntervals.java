package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        // Sort intervals based on the start value
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (nextStart <= currentEnd) {
                // There is an overlap, so we merge
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap, add the next interval to the result
                currentInterval = interval;
                result.add(currentInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = merge(intervals);

        // Print the merged intervals
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}