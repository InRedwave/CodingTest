package backJoon.step.easy;

import java.util.Scanner;

public class Main_2675 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        // 테스트 케이스 개수 입력
        for(int i = 0; i<T; i++){
            int N = scanner.nextInt();
            String x = scanner.next();

            System.out.println(N);

            // 주어진 개수만큼 반복
            int count = 0;
            String answer = new String();
            while(count == x.length()){
                for(int j = 0; j< N; j++){
                    answer += x.charAt(count);
                    count ++;
                };
            }
            System.out.println();

//            int N = Integer.parseInt(x.substring(0,1));
//            String text = x.substring(2, length + 1);
//            System.out.println(N + " : " + text);
        };
    };
};
