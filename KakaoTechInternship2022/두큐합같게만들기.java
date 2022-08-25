package KakaoTechInternship2022;

import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/118667?language=java

public class 두큐합같게만들기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2}));
    }

    static class Solution {
        public int solution(int[] queue1, int[] queue2) {
            int answer = 0;
            LinkedList<Integer> list1 = new LinkedList<>();
            LinkedList<Integer> list2 = new LinkedList<>();

            long sum = Arrays.stream(queue1).sum() + Arrays.stream(queue2).sum();

            if (sum % 2 != 0) return -1;

            for (int i : queue1) list1.add(i);
            for (int i : queue2) list2.add(i);
            long sum1 = 0;
            long sum2 = 0;
            for (int i : list1) sum1 += i;
            for (int i : list2) sum2 += i;
            while (true) {
                if (list1.size() == 0 || list2.size() == 0) {
                    return -1;
                }

                if (sum1 == sum2) break;

                if (sum1 > sum2) {
                    list2.add(list1.peek());
                    sum2 += list1.peek();
                    sum1 -= list1.pop();
                } else {
                    list1.add(list2.peek());
                    sum1 += list2.peek();
                    sum2 -= list2.pop();
                }
                answer++;
            }
            return answer;
        }
    }
}
