package com;
import java.util.Arrays;
import java.util.List;
public class FilterEvenNo {

  public static void main(String[] args) {
    List<Integer> nos = Arrays.asList(2,34,678,3);
    nos.stream()
           .filter(a -> a % 2 == 0)
//           .forEach(a -> System.out.print(a+" "));
           .forEach(System.out::println);
           
  }
}