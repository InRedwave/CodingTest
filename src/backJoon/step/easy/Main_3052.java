package backJoon.step.easy;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main_3052 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int[] array = new int[10];
       // int[] answer= new int[10];
        for(int i = 0; i < 10; i++){
          array[i] = scanner.nextInt();
          array[i] = array[i] % 42;
        };
        int count = 0;
        int result = 0;
//        // 중복 제거 -> hashmap 사용
//        HashSet<Integer> hashSet = new HashSet<>();
//        for(int j = 0; j<10; j++){
//            hashSet.add(array[j]);
//        };
        for(int i = 0; i<10; i ++){
            for(int j = i+1; j < 10; j++){
                if(array[i] == array[j]){
                    count ++;
                };
            };
            if(count == 0) result ++;
        };
        System.out.println(result);
    };
};
