package backJoon.step.easy;

import java.util.Scanner;

public class Main_27866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String word = scanner.next();
        int idx = scanner.nextInt();
        System.out.println(Character.toString(word.charAt(idx-1)));
    };
};
