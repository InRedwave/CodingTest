package backJoon.step.easy;

import java.util.Scanner;

public class Main_9086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String text = "";
        for(int i = 0; i<N; i++){
            text = scanner.next();

            System.out.print(Character.toString(text.charAt(0)));
            System.out.print(Character.toString(text.charAt(text.length()-1)));
            System.out.println();
        };
    };
};
