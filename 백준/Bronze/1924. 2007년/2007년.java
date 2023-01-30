import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int num = Integer.parseInt(s[1]);    //모든수의 합

        // 2월: 31, 3월: 28, 4월: 31, 5월: 30, 6월: 31, 7월: 30, 8월: 31, 9월: 31, 10월: 30, 11월: 31, 12월 30

        //월별로 숫자 더함
        for(int i = 1;i<=Integer.parseInt(s[0]);i++){
            switch (i){
                case 2: case 4: case 6: case 8: case 9: case 11:
                    num+=31;
                    break;
                case 5: case 7: case 10: case 12:
                    num+=30;
                    break;
                case 3:
                    num+=28;
                    break;
            }
        }
        trans(num);
    }

    static void trans(int num){
        switch (num%7){
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 0:
                System.out.println("SUN");
                break;
        }

    }
}
