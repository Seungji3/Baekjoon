import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        1번째줄에는 밑에 들어올 총 갯수가 들어옴
//        2번째줄에는 갯수만큼 N의 수가 들어옴(제일 큰수와 작은수 뽑고 x, 2보다는 작지 않음, 한자릿수면 알아서 x)
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        String[] stringDivisorNum = bf.readLine().split(" ");
        int[] divisorNum = new int[num];
        int result;

        for (int i = 0; i < divisorNum.length; i++) {
            divisorNum[i] = Integer.parseInt(stringDivisorNum[i]);
        }
        result = Arrays.stream(divisorNum).min().getAsInt() * Arrays.stream(divisorNum).max().getAsInt();
        if (num == 1) result = divisorNum[0] * divisorNum[0];
        System.out.println(result);
    }
}