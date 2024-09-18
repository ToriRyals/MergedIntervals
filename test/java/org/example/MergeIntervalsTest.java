package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MergeIntervalsTest {

    @Test
    void testMergeOverlappingIntervals() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected, MergeIntervals.merge(intervals));
    }

    @Test
    void testMergeNonOverlappingIntervals() {
        int[][] intervals = {{1, 2}, {3, 4}, {5, 6}};
        int[][] expected = {{1, 2}, {3, 4}, {5, 6}};
        assertArrayEquals(expected, MergeIntervals.merge(intervals));
    }

    @Test
    void testMergeAllOverlappingIntervals() {
        int[][] intervals = {{1, 5}, {2, 6}, {3, 7}};
        int[][] expected = {{1, 7}};
        assertArrayEquals(expected, MergeIntervals.merge(intervals));
    }

    @Test
    void testMergeSingleInterval() {
        int[][] intervals = {{1, 4}};
        int[][] expected = {{1, 4}};
        assertArrayEquals(expected, MergeIntervals.merge(intervals));
    }

    @Test
    void testMergeEmptyArray() {
        int[][] intervals = {};
        int[][] expected = {};
        assertArrayEquals(expected, MergeIntervals.merge(intervals));
    }

    @Test
    void testMergeIntervalsWithSingleElement() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] expected = {{1, 5}};
        assertArrayEquals(expected, MergeIntervals.merge(intervals));
    }
}