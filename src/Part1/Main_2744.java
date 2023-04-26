package Part1;

import java.util.Scanner;

public class Main_2744 {
    public static void main(String[] args) {

/* 풀이 없이 해결
   Character.isLowerCase, Character.isUpperCase 메소드 사용
* */
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String answer = new String();
//
//        char[] charArray = input.toCharArray();
//        for(char i : charArray){
//            if(Character.isLowerCase(i)){
//              answer += Character.toUpperCase(i);
//            } else {
//                answer += Character.toLowerCase(i);
//            }
//        }
//        System.out.println(answer);
/*  풀이
    ASCII 코드를 사용한 풀이 방법.
* */
/*
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); //띄어쓰기, 공백 등으로 구분된 문자 하나를 받음.
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if('A' <= ch && ch <= 'Z'){
                System.out.print((char)('a' + ch - 'A'));
            } else {
                System.out.print((char)('A' + ch - 'a'));
            }
        }
*/
/*  덧셈 연산 사용하기
*
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); //띄어쓰기, 공백 등으로 구분된 문자 하나를 받음.
        String ans = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if('A' <= ch && ch <= 'Z'){
                ans += (char)('a' + ch - 'A');
            } else {
                ans += (char)('A' + ch - 'a');
            }
        }
        System.out.println(ans);
*/

        /* toCharArray() 사용하기
         * */
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); //띄어쓰기, 공백 등으로 구분된 문자 하나를 받음.
        char[] ans = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if('A' <= ch && ch <= 'Z'){
                ans[i] = (char)('a' + ch - 'A');
            } else {
                ans[i] = (char)('A' + ch - 'a');
            }
        }
        System.out.println(ans);

    }
}
