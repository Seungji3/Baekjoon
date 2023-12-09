import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //1. 0시 일때 분을 마이너스한 경우 음수일때 >> 23시로 바꾸고 분 계산
        //2. 0시가 아니고 마이너스한 경우 음수일때 >> time의 시간 -1 & 분 계산
        //3.0시가 아니고 음수가 아닐때 >> 분 계산
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] time = new int[2];
        int minute = 60;
        int day = 24;

        for(int i = 0;i<time.length;i++){
            time[i] = Integer.parseInt(st.nextToken());
        }

        if(time[1]-45<0){
            if (time[0]==0){
                time[0] = day-1;
            }else{
                time[0] -= 1;
            }
            time[1] += minute-45;
        }else{
            time[1] -= 45;
        }
        bw.write(time[0]+" "+time[1]);
        bw.flush();
    }
}