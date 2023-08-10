package programmers.lv1;

public class 크기가작은부분문자열 {

    public static int solution(String t, String p){
        int answer = 0;

        for(int i = 0; i<t.length()-p.length()+1; i++){
            String temp = t.substring(i, i+p.length());
            System.out.println(temp);
            Long tempLong = Long.parseLong(temp);

            if(tempLong <= Long.parseLong(p)){
                answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int answer = solution("10203", "15");
        System.out.println(answer);
    }
}
