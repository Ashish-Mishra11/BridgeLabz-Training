package com.queues.slidingwindowmaximum;
class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque deque = new Deque(n);
        int idx = 0;

        for (int i = 0; i < n; i++) {

            // Remove elements outside the window
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }

            // Remove smaller elements
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.removeLast();
            }

            deque.addLast(i);

            // Window formed
            if (i >= k - 1) {
                result[idx++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
