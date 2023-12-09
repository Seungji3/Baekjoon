import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 단순하게 몇개의 입력하는지
        //2. 그중 최소값 최대값 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] list = new int[Integer.parseInt(br.readLine())];
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        for(int i = 0;i<list.length;i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(Arrays.stream(list).min().getAsInt() + " " + Arrays.stream(list).max().getAsInt());
        bw.flush();
        bw.close();
    }
}