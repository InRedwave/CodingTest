package part1;

import java.util.Scanner;

public class Main_1157 {
    public static void main(String[] args) {

        /*풀이
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
        */



        /*Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] count = getAlphabetCount(str);

        //개수 확인
        for(int i =0; i<26; i ++) {
            if(count[i] > 0){
                System.out.println((char) ('A'+ 'i') + ": " + count[i]);
            }
        }

        int maxCount = -1;
        char maxAlphabet = '?';
        for(int i = 0; i < 26; i++){
            if(count[i] > maxCount){
                maxCount = count[i];
                maxAlphabet = (char)('A'+i);
            } else if(count[i] == maxCount){
                maxAlphabet = '?';
            }
        }*/

        /*for(int i = 0; i< 26; i++){
            중복값 2개 이상이면 ? 출력 처리해주기
            if(count[i] == maxCount){

            }
        }*/

       /* System.out.println(maxAlphabet);*/

        /*추가 수정 코드*/
        /*Scanner sc = new Scanner(System.in);
        *//*String str = sc.next().toUpperCase(); 사용 가능함.(str 대문자만 존재한다) *//*
        String str = sc.next().toUpperCase();
        int[] count = getAlphabetCount(str);

        //개수 확인
        for(int i =0; i<26; i ++) {
            if(count[i] > 0){
                System.out.println((char) ('A'+ 'i') + ": " + count[i]);
            }
        }

        int maxCount = -1;
        char maxAlphabet = '?';
        for(int i = 0; i < 26; i++){
            if(count[i] > maxCount){
                maxCount = count[i];
                maxAlphabet = (char)('A'+i);
            } else if(count[i] == maxCount){
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);
        */

        //tnwjd 3
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int maxCount = -1;
        char maxAlphabet = '?';
        for(char alp = 'A'; alp <= 'Z'; alp ++){
            int count = getAlphabetCount(str, alp);
            if(count > maxCount){
                maxCount = count;
                maxAlphabet = alp;
            }

                else if(count == maxCount){
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);





    }
    //기존
   /* public static int[] getAlphabetCount(String str){
        int[] count = new int[26];
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if('A' <= ch && ch<= 'Z'){
                count[ch - 'A']++;
            } else {
                count [ch - 'a']++;
            }
        }
        return count;
    }*/

    //input 대문자로 수정한 경우, 대소문자 구분할 필요가 없다.
    public static int[] getAlphabetCount(String str){
        int[] count = new int[26];
        for(int i = 0; i< str.length(); i++){
            count[str.charAt(i) - 'A']++;
        }
        return count;
    }

    //일치하는 알파벳 개수 리턴해야 하는 경우.
    public static int getAlphabetCount(String str, char alp){
        int count = 0;
        for(int i = 0; i< str.length(); i++){
            if(alp == str.charAt(i)) count ++;
        }
        return count;
    }

 }
