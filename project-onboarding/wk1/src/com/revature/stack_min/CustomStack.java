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
    int value = mainStack.pop();

    if(minElStack.peek() == value) {
      minElStack.pop();
    }
  }

  Integer min() {
    return minElStack.peek();
  }
}
