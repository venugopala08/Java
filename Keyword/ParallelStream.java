import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        
        int size = 10000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for (int n =0 ; n<size; n++)
        {
            nums.add(ran.nextInt(100));      
        }
        
        // int sum = nums.stream()
        //     .map(n -> n*2)
        //     .reduce(0, (c,e) -> c+e);


        long startseq = System.currentTimeMillis();
;
        int sum2 = nums.stream()
            .map(n -> {
                try{
                    Thread.sleep(1);
                } catch(Exception e) {

                }
                return n*2;
            })
            .mapToInt(n -> n)
            .sum();     // Using mapToInt for better performance . in above line we have to convert Integer to int to calculate sum
        long endseq = System.currentTimeMillis();


        long startpara = System.currentTimeMillis();
        int sum3 =nums.parallelStream()
            .map(n -> {
                try{
                    Thread.sleep(1);
                } catch(Exception e) {
                    
                }
                return n*2;
            })
            .mapToInt(n -> n)
            .sum();
        long endpara = System.currentTimeMillis();

        System.out.println( sum2 + " " + sum3);
        System.out.println("Sequential Stream Time: " + (endseq - startseq) + " ms");
        System.out.println("Parallel Stream Time: " + (endpara - startpara) + " ms");
    }
}
