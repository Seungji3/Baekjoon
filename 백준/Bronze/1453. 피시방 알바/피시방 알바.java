import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] tempList = sc.nextLine().split(" ");
        LinkedHashSet<String> strSEt = new LinkedHashSet<>();
        for (String txt : tempList) {
            strSEt.add(txt);
        }

        System.out.println(num - strSEt.size());
    }
}