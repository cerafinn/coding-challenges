package com.revature.sumList;

import java.util.LinkedList;

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
  }
}
