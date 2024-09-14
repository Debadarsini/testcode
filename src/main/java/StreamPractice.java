import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main (String [] args){
        List<Integer> sample = Arrays.asList(2,6,9,4,50,100);

        //Example of stream and filter

      List<Integer> output1=   sample.stream().filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
      System.out.println(output1);

      List<Integer> output2 = sample.stream().map(i->i+=6).collect(Collectors.toList());

        System.out.println(output2);

    }
}
