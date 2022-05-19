package com.revature.stack_min;

import java.util.Stack;

public class CustomStack {
  // properties: can they be generic?
  Stack<Integer> mainStack;
  Stack<Integer> minElStack;

  void push(Integer element) {
    mainStack.push(element);
    if (minElStack.isEmpty() || minElStack.peek() >= element) {
      minElStack.push(element);
    }
  }

  void pop() {
    // remove from tail/top of stack
    // check against min element -- what happens if min element == pop value?
  }

  Integer min() {
    //return min value
    return 0;
  }
}
