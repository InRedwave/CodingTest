package backJoon.step.part1;

import java.util.Scanner;

public class Main_1919 {
    public static int[] getAlphabetCount(String str){
        int[] count = new int[26];
        for(int i = 0; i<str.length(); i++)
            count[str.charAt(i)-'a']++;
        return count;
    }


    public static void main(String[] args) {
        /* 개인 풀이
         *
        Scanner sc = new Scanner(System.in);
        String input_A = sc.next();
        String input_B = sc.next();

        String[] array_A = input_A.split("");
        String[] array_B = input_A.split("");


        Set<String> setA = new HashSet<>();
        Set<String> setB = new HashSet<>();
        for(int i = 0; i< input_A.length();i++){
            setA.add(array_A[i]);
        }
        for(int i = 0; i< input_A.length();i++){
            setB.add(array_A[i]);
        }

        for(String a : setA){
            System.out.print(a);
        }
*/

        /*풀이방법
        *
        *

        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //공백으로 구분된 한 문자열
        String b = sc.next();

        //각각의 알파벳 구성을 구한다.
        //알파벳 소문자만 들어오므로 26칸을 만들어준다.
        int[] countA = new int[26];
        int[] countB = new int[26];

        //해당 항목을 만나면 개수 증가 : count 배열
        // dared : [1, 0, 0, 2 ...]
        for(int i=0; i<a.length(); i++){
            countA[a.charAt(i) - 'a']++;
        }
        for(int i=0; i<b.length(); i++){
            countB[b.charAt(i) - 'a']++;
        }

        int ans = 0;
        for(int i = 0; i<26; i++){
            if(countA[i] > countB[i]){
                ans += countA[i] - countB[i];
            } else if(countB[i] > countA[i]) {
                ans += countB[i] - countA[i];
            }
        }
        System.out.println(ans);
 */

        /*공통 부분 함수로 분리하기*/
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //공백으로 구분된 한 문자열
        String b = sc.next();

        //각각의 알파벳 구성을 구한다.
        //알파벳 소문자만 들어오므로 26칸을 만들어준다.
        int[] countA = getAlphabetCount(a);
        int[] countB = getAlphabetCount(b);

        int ans = 0;
        for(int i = 0; i<26; i++){
            ans += Math.abs(countA[i] - countB[i]);
        }
        System.out.println(ans);
    }
}