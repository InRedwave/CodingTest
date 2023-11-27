package backJoon.step.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_10811 {
    static ArrayList<Integer> basketChange(int x, int y, ArrayList<Integer> array){
        if(y-x < 2){
            int temp = array.get(y);
            array.set(y, array.get(x));
            array.set(x, temp);
        } else {
            for (int i = 0; i < (y - x+1)/2 ; i++) {
                int temp = array.get(y - i);
                array.set(y - i, array.get(x + i));
                array.set(x + i, temp);
            };
        };
        return array;
    };


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        ArrayList<Integer> array = new ArrayList<>();

        // 바구니 번호 매기기
        for(int i = 1; i<= N; i++){
            array.add(i);
        };

        // 바구니 위치 바꾸기
        for(int i = 0; i<M; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            // arrayList idx = 0 부터 시작
            basketChange(x-1, y-1, array);
        };
        // 출력
        for(int i = 0; i<array.size(); i++){
            System.out.print(array.get(i) + " ");
        };
    };
};
