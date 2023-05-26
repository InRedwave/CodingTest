package programmers.lv1;

public class minimalSizeString {


    public static void main(String[] args) {
        String t = "500220839878";
        String p = "7";

        minimalSizeString main = new minimalSizeString();
        int answer = main.solution(t, p);

        System.out.println(answer);
    }

    public int solution(String t, String p){
        Long answer = 0L;
        Long input_t = Long.parseLong(t);
        Long input_p = Long.parseLong(p);
        int count = 0;

        //t를 index 로 자르기 위한 준비
        int idx = 0;
        int length = p.length();
        co: for(int i = 0; i < t.length(); i++){
            //t = 3141592
            //p = 271 -> 3
            if(i + length <= t.length()){
                answer = Long.parseLong(t.substring(i, i+length));
                if(answer <= input_p){
                    count++;
                }
            }
        }
        Integer.parseInt(String.valueOf(count));
        return count;
    }
}
