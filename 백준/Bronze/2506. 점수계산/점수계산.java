import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0, nextPlus = 0, score = 0, maxValue = Integer.parseInt(br.readLine());
        ArrayList<String> AL = new ArrayList<>(List.of(br.readLine().split(" ")));
        ArrayList<Integer> outL = new ArrayList<>();

        while (count < maxValue) {
            if (AL.get(count).toString().equals("0")) {
                nextPlus = 0;
                outL.add(0 + nextPlus);
            } else {
                outL.add(1 + nextPlus);
                nextPlus++;
            }
            count += 1;
        }

        for (int i = 0; i < outL.size(); i++) {
            if (outL.get(i) != 0) {
                score += outL.get(i);
            }
        }

        bw.write(score + "\n");
        bw.flush();
        bw.close();
    }
}
