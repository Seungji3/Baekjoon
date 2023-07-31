import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String now = sc.nextLine();
        List<String> list = List.of(sc.nextLine().trim().split(" "));
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(now)) count++;
        }
        System.out.println(count);
    }
}