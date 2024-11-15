import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        Boolean result;
        List<Long> list = Stream.of(
                        sc.nextLine().split(" ")
                )
                .map(Long::parseLong)
                .collect(Collectors.toList());

        while (true) {
            result = list.get(2) * num > list.get(1) * num + list.get(0);
            if (result)
                break;
            if (num >= Integer.MAX_VALUE){
                num = -1;
                break;
            }
            ++num;
        }
        System.out.println(num);
    }
}
