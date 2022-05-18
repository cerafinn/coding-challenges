package com.revature.sum_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class Main {
  public static void main(String[] args) {
    String start = "start";
    String end = "end";

    LinkedList<Integer> listOne = new LinkedList<>();

    listOne.addFirst(7);
    listOne.add(1);
    listOne.addLast(6);

    LinkedList<Integer> listTwo = new LinkedList<>();
    listTwo.addFirst(5);
    listTwo.add(9);
    listTwo.addLast(2);

    Integer numOne = getNum(start, listOne);
    Integer numTwo = getNum(start, listTwo);

    Integer numThree = getNum(end, listOne);
    Integer numFour = getNum(end, listTwo);

    Integer sumOne = sumTotal(numOne, numTwo);
    Integer sumTwo = sumTotal(numThree, numFour);

    System.out.println(numOne);
    System.out.println(numTwo);

    System.out.println(sumOne);
    System.out.println(sumTwo);
  }

  static Integer sumTotal(Integer ...values) {
    Integer sum = 0;

    for(int value : values) {
      sum += value;
    }
    return sum;
  }

  static Integer getNum(String firstNum, LinkedList<Integer> list) {
    Iterator<Integer> it;
    StringBuilder num = new StringBuilder();

    if(Objects.equals(firstNum, "start")) {
      it = list.iterator();
    } else {
      it = list.descendingIterator();
    }

    while (it.hasNext()) { num.append(it.next()); }

    return Integer.valueOf(num.toString());
  }
}
