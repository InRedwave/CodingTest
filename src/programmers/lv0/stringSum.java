package programmers.lv0;

public class stringSum {
    public static int solution(String num_str) {
        int answer = 0;

        // num_str 길이 재서 자리수만큼 for문 돌리기
        int length = num_str.length();
        for(int i = 0; i< length; i++){
           // System.out.println(num_str.charAt(i));
            //https://frhyme.github.io/java/java_basic02_char_to_int/
            answer += Character.getNumericValue(num_str.charAt(i));
        }
        return answer;
    }

    public static void main(String[] args) {
        int answer = solution("1000000");
        System.out.println(answer);
    };
};
