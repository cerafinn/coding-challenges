//package com.revature.stack_min;
//
//import java.util.Stack;
//
//public class CustomStack {
//  // properties: can they be generic?
//  Stack<Integer> mainStack;
//  Stack<Integer> minElStack;
//
//  public CustomStack() {
//    this.mainStack = new Stack<>();
//    this.minElStack = new Stack<>();
//  }
//
//  void push(Integer element) {
//    mainStack.push(element);
//    if (minElStack.isEmpty() || minElStack.peek() >= element) {
//      minElStack.push(element);
//    }
//  }
//
//  void pop() {
//    if(mainStack.isEmpty()) {
//      System.out.println("Nothing on the stack");
//      return;
//    }
//    int value = mainStack.pop();
//
//    if(minElStack.peek() == value) {
//      minElStack.pop();
//    }
//  }
//
//  Integer min() {
//    return minElStack.peek();
//  }
//}
