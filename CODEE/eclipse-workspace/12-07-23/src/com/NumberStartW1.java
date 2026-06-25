package com;

import java.util.*;
import java.util.stream.*;

public class NumberStartW1{
    public static void main(String args[]) {
            List<Integer> list = Arrays.asList(12,134,678,13);
            list.stream()
                  .map(s -> s +"")
//            .map(s -> String.valueOf(s))
                  .filter(s -> s.startsWith("1"))
                  .forEach(a -> System.out.print(a+" "));
    }
}
