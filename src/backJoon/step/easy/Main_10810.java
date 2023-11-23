package backJoon.step.easy;

import java.util.Scanner;

public class Main_10810 {
    public static void main(String[] args) {
        //공 넣기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int array[] = new int[N];

        for(int i = 0; i<M; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            basket(x, y, z, array);

        };
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
    };

    static int[] basket(int x, int y, int z, int[] array){

        for(int i = x; i<=y; i++){
            array[i-1] = z;
        }
        return array;
    };
}

/*  1, 2, 3, 4, 5
*   3, 3
*         4, 4
*   1, 1, 1, 1
*      2
*   1, 2, 1, 1, 0
* */