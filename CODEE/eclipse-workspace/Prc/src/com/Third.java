package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Third {
	public static void main(String[] args) {

        List<Integer> list=Arrays.asList(1,3,4,0,9,2);

        Collections.sort(list);

        System.out.println(list.get(list.size()-3));

}

}