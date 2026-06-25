package col;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

 

public class Main {

 

    public static void main(String[] args) {

 

        List<Student> list = new ArrayList<>(Arrays.asList(new Student(2, "Shradha", 23578L),
                new Student(4, "Devraj", 235L), new Student(1, "Shrya", 23L), new Student(9, "raj", 235L),
                new Student(8, "Pooja", 5L), new Student(3456, "Dev", 2097L)));

 

        // to group by student name length

 

        Map<Integer, List<Student>> lengthObj = list.stream()
                .collect(Collectors.groupingBy(a -> a.getsName().length()));

 

        // to get student name

 

        Map<Boolean, List<String>> lengthObj1 = list.stream().collect(Collectors.partitioningBy(a -> a.getsRollNumber()>10,
                Collectors.mapping(a1 -> a1.getsName(), Collectors.toList())));

 

        lengthObj.forEach((k, v) -> System.out.println(k + "=" + v));

        System.out.println("--------------------------------------------------");
        System.out.println();
        lengthObj1.forEach((k, v) -> System.out.println(k + "=" + v));

 

    }

 

}