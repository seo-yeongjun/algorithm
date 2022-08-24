package KakaoTechInternship2022;

import java.util.HashMap;

//https://school.programmers.co.kr/learn/courses/30/lessons/118666

public class 성격유형검사하기 {
    public static void main(String[] args) {
        var survey1 = new String[]{"AN", "CF", "MJ", "RT", "NA"};
        var choices1 = new int[]{5, 3, 2, 7, 5};
        System.out.println(solution(survey1, choices1));
    }

    static String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        char[][] personality = new char[][]{{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < choices.length; i++) {
            int num = choices[i];
            if (num / 4 == 0) {
                int score = 4 - (num % 4);
                map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) + score);
            }
            if (num / 4 == 1) {
                int score = num % 4;
                map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + score);
            }
        }
        for (char[] c : personality) {
            int first = map.getOrDefault(c[0], 0);
            int second = map.getOrDefault(c[1], 0);
            if (first >= second)
                answer.append(c[0]);
            else
                answer.append(c[1]);
        }
        return answer.toString();
    }
}
