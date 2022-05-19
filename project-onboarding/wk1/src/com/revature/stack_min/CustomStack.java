package com.revature.stack_min;

import java.util.Stack;

public class CustomStack<E> {
  // properties: can they be generic?
  Stack<Integer> mainStack;
  Stack<Integer> minElStack;

  public CustomStack(Stack<Integer> mainStack, Stack<Integer> minElStack) {
    this.mainStack = mainStack;
    this.minElStack = minElStack;
  }

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
