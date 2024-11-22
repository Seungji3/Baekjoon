import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> indent = Stream.of(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> nums = Stream.of(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int maxValue = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                for (int k = 0; k < nums.size(); k++) {
                    if(nums.get(i) == nums.get(j) || nums.get(i) == nums.get(k) || nums.get(j) == nums.get(k))
                        continue;
                    if((nums.get(i) + nums.get(j) + nums.get(k)) <= indent.get(1) && nums.get(i) + nums.get(j) + nums.get(k) >= maxValue)
                        maxValue = nums.get(i) + nums.get(j) + nums.get(k);
                }
            }
        }

        System.out.println(maxValue);
    }
}
