package com.revature.stack_min;

import java.util.Stack;

public class CustomStack<E> {
  // properties: stack of elements and minElement -- can the min el be generic?
  Stack<E> mainStack;
  Stack<E> minElStack;

  public CustomStack(Stack<E> mainStack, Stack<E> minElStack) {
    this.mainStack = mainStack;
    this.minElStack = minElStack;
  }

  void push(E element) {
    mainStack.push(element);
    if (minElStack.isEmpty() || minElStack.peek() >= element) {
      minElStack.push(element);
    }
  }

  void pop() {
    // remove from tail/top of stack
    // check against min element -- what happens if min element == pop value?
  }

  E min() {
    //return min value
    return E;
  }
}
