package backJoon.step.easy;

import java.util.Scanner;

public class Main_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];
        int max = 0;
        int count = 1;
        for(int i = 1; i<=9; i++){
            array[i] = scanner.nextInt();
            if(max < array[i] && array[i]<100){
                max = array[i];
                count = i;
            };
        };
        System.out.println(max);
        System.out.println(count+1);
    };
};
