package programmers.lv1;

public class 푸드파이트대회 {
    public static String Solution(int[] food){
        String answer = "0";
        for(int i = food.length-1; i>0; i--){
            // 홀수인 경우
            if(food[i]%2 != 0){
                for(int j=1; j<=food[i]/2; j++ ) {
                    answer = i + answer + i;
                }
            };
            // 짝수인 경우
            if(food[i]%2 == 0){
                for(int j=1; j<=food[i]/2; j++ ) {
                    answer = i + answer + i;
                }
            };
        }
        System.out.println(answer);

        return answer;
    };

    public static void main(String[] args) {
        int[] array = {1, 7, 1, 2};
        String answer = Solution(array);


    }

}
