package com.revature.sum_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class Main {
  public static void main(String[] args) {

    LinkedList<Integer> listOne = new LinkedList<>();

    listOne.addFirst(7);
    listOne.add(1);
    listOne.addLast(6);

    LinkedList<Integer> listTwo = new LinkedList<>();
    listTwo.addFirst(5);
    listTwo.add(9);
    listTwo.addLast(2);

    Integer numOne = getNum(listOne);
    Integer numTwo = getNum(listTwo);

    System.out.println(numOne);
    System.out.println(numTwo);
  }

  static Integer sumTotal(Integer ...values) {
    return values[0];
  }

  static Integer getNum(LinkedList<Integer> list) {
    Iterator<Integer> it = list.descendingIterator();

    StringBuilder num = new StringBuilder();

    while (it.hasNext()) {
      num.append(it.next());
    }

    return Integer.valueOf(num.toString());
  }
}
