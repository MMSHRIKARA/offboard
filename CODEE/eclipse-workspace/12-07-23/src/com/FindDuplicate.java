package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
  public static void main(String args[]) {
          List<Integer> list = Arrays.asList(2,34,678,3,33,3,3);
          Set<Integer> set = new HashSet();
          list.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);
  }
}

