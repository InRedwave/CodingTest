package backJoon.step.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_10809 {
    static void Solution(String text, String[] alphabet) {
        // 알파벳 순번만큼 돌면서 확인
        String answer = new String();
        for(int i = 0 ; i<alphabet.length; i++){
            int count = 0;
            // 단어 개수만큼 돌면서 비교
            for(int j = 0; j<text.length(); j++){
                // 알파벳이 텍스트에 포함되어 있는 경우
                String splitText = Character.toString(text.charAt(j));
                if(alphabet[i].equals(splitText)){
                    answer += text.indexOf(splitText);
                    answer += " ";
                    count ++;
                    break;
                };
            };
            if(count == 0){
                answer += "-1 ";
            }
        };
        System.out.println(answer);
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                            "u", "v", "w", "x", "y", "z"};

        Solution(text, alphabet);


    };

};
