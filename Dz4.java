import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Dz4 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 19, -2, 5, 3, 34, 29, 12);
IntSummaryStatistics stats = primes.stream()
                                 .mapToInt((x) -> x)
                                 .summaryStatistics();
System.out.println(stats);
    }
}
