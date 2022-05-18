package com.revature.stack_min;

import java.util.Stack;

public class Main {
//  2) Stack Min: How would you design a stack which, in addition to push and pop, has a function min which returns the minimum
//  element? Push, pop and min should all operate in 0(1) time.

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();

    st.push(27);
    st.push(77);
    st.push(14);
    st.push(34);

    System.out.println(st.peek());
    st.pop();
    st.pop();

    System.out.println(st.peek());
  }
}
