package col;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMethods {

	 

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        long count = list.stream().count();
        int min = list.stream().mapToInt(Integer::intValue).min().orElse(0);
        int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        float avg = sum/count;

        System.out.println("Total count: "+count);
        System.out.println("Sum: "+sum);
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("average: "+avg);
    }

 

}
//public class StreamMethods {
//	public static void main(String[] args) {
//		
//	
//	List <Integer> l=Arrays.asList(2,3,5,7,11,13,17,19,23,29);
//    Integer c=(int) l.stream().count();
//    System.out.println("Count = "+c);
//    Integer sum=l.stream().reduce((a,b)->(a+b)).get();
//    System.out.println("Sum = "+sum);
//    System.out.print("minimum value = ");
//    System.out.println(l.stream().min(Comparator.comparing(Integer::valueOf)).get());
//    System.out.print("Maximum value = ");
//    System.out.println(l.stream().max(Comparator.comparing(Integer::valueOf)).get());
//    System.out.print("Average value = ");
//    System.out.println(l.stream().reduce((a,b)->(a+b)/c).get());
//
//}
//}