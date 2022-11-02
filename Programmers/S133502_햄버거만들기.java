package Programmers;

import java.util.LinkedList;

class S133502_햄버거만들기 {
    public static int solution(int[] ingredient) {
        int answer = 0;
        LinkedList<Integer> stack = new LinkedList<Integer>();
        for (int i : ingredient) {
            stack.push(i);
            if (stack.size() >= 4) {
                if (stack.get(stack.size() - 1) == 1 && stack.get(stack.size() - 2) == 3 && stack.get(stack.size() - 3) == 2 && stack.get(stack.size() - 4) == 1) {
                    for (int p = 0; p < 4; p++) {
                        stack.pop();
                    }
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] ingredient = new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2};
        System.out.println(solution(ingredient));
    }
}
