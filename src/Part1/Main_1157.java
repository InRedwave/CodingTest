package Part1;

import java.util.Scanner;

public class Main_1157 {
    public static void main(String[] args) {

        /*풀이*/
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int[] count = new int[26];
        for(int i = 0; i<input.length(); i++){
            char ch = input.charAt(i);
            if('A' <= ch && ch <= 'Z'){
                count[input.charAt(i)-'A']++;
            } else {
                count[input.charAt(i)-'a']++;
            }
        }
        int max = 0;
        int countMax = 0;
        int otherMax = 0;
        String answer = new String();
        for(int i : count){
            if(max < count[i]){
                max = count[i];
                countMax ++;
            }
        }


        if(countMax > 1){
            System.out.println("?");
        } else {
            System.out.println(input.charAt(max));
        }




    }

}
