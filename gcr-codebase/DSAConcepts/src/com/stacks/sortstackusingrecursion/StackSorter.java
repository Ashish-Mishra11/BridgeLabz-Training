package com.stacks.sortstackusingrecursion;
class StackSorter {

    // Sort entire stack
    public static void sortStack(Stack stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            sortedInsert(stack, temp);
        }
    }

    // Insert element in sorted order
    private static void sortedInsert(Stack stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int temp = stack.pop();
        sortedInsert(stack, element);
        stack.push(temp);
    }
}
