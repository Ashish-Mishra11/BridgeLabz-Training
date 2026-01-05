package com.stacks.stockspanproblem;
class StockSpan {

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack stack = new Stack(n);

        // First day span is always 1
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {

            // Pop while price is less or equal
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            stack.push(i);
        }

        return span;
    }
}
