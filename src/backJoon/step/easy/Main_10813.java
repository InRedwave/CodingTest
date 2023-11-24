package backJoon.step.easy;

import java.util.Scanner;

public class Main_10813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int basket[] = new int[N + 1];

        for(int i = 1; i<= N; i ++){
            basket[i] = i;
        };

        for(int j = 1; j <= M; j++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            change(x, y, basket);
        };

        for(int k=1; k<basket.length; k++){
            System.out.print(basket[k] + " ");
        }


    };
    static int[] change(int x, int y, int array[]){
        int temp = array[y];
        array[y] = array[x];
        array[x] = temp;

        return array;
    }

};
