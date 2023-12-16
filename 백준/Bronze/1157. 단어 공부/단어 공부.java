import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
//        1. 대소문자의 문자를 받으면 upper&lower로 변환(구분하지 않는다고 함)
//        2. 입력받은 문자를 Hashset으로 알파벳별로 치환
//        3. Hashset의 각각의 알파벳 값을 count해서 제일 많이 사용된 값을 가져옴
//        ※단. 많이 사용된 알파벳이 여러개 존재시 "?"로 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().toUpperCase().split("");
        HashSet lists = new HashSet<>(List.of(lines));
        Map<String, Integer> result = new HashMap<>();

        for (Object list : lists) {   //각각의 lists값이 포함된 갯수를 map에 넣음
            int temp = 0;
            for (String line : lines) {
                if (list.equals(line)) {
                    temp++;
                }
            }
            result.put(list.toString(), temp);
        }

        Integer max = Collections.max(result.values()); // 최대값
        String Alpha = null;
        int temp = 0;

        for (String key : result.keySet()) { //max값이 있으며 map의 values값이 중복이면 그때 바로 "?"표 출력
            if (result.get(key).equals(max)) {
                temp++;
                Alpha = key;
            }
        }

        if (temp!=1) {
            System.out.println("?");
        } else {
            System.out.println(Alpha);
        }

    }
}