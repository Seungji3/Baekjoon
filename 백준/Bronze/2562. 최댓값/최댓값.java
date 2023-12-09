import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 9개의 출력이 이루어짐
        //2. 최댓값이 몇번째인지 확인이 필요하기 때문에 count

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] list = new int[9];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        int temp = Arrays.stream(list).max().getAsInt();
        for (int i = 0; i < list.length; i++) {
            count++;
            if (list[i] == Arrays.stream(list).max().getAsInt()) {
                break;
            }
        }

        bw.write(temp + "\n" + count);
        bw.flush();
        bw.close();
    }
}